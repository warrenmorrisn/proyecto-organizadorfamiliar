package ar.gob.siliconmisiones.organizadorfamiliar.controller;

import ar.gob.siliconmisiones.organizadorfamiliar.entity.Notificacion;
import ar.gob.siliconmisiones.organizadorfamiliar.service.NotificacionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/notificacion")
public class NotificacionController {

    private NotificacionService notificacionService;

    public NotificacionController(NotificacionService notificacionService) {
        this.notificacionService = notificacionService;
    }

    @GetMapping("/lista")
    public String ListaNotificacion(Model model) {
        List<Notificacion> notificaciones = notificacionService.findAll();

        model.addAttribute("notificaciones",notificaciones);

        return "notificacion/lista-notificaciones";
    }

    @GetMapping("/nuevaNotificacion")
    public String nuevaNotificacion(Model model) {

        Notificacion notificacion = new Notificacion();

        model.addAttribute("notificacion", notificacion);

        return "notificacion/lista-notificaciones";
    }

    @GetMapping("/modificarNotificacion")
    public String modificarNotificacion(@RequestParam("notificacionId") int id, Model model) {

        //obtiene la notificacion de servicio
        Notificacion notificacion = notificacionService.findById(id);

        //se settea la notificacion como un atributo de model para precargar el formulario
        model.addAttribute("notificacion",notificacion);

        //redirecciona a la lista de notificaciones
        return "notificacion/lista-notificaciones";
    }

    @PostMapping("/guardarNotificacion")
    public String guardarNotificacion(@ModelAttribute("notificacion") Notificacion notificacion) {

        //Guarda la notificacion
        notificacionService.save(notificacion);

        //se utiliza el redirect para prevenir duplicacion de submissions
        return "redirect:/notificacion/lista-notificaciones";
    }

    @GetMapping("/borrarNotificacion")
    public String borrarNotificacion(@RequestParam("notificacionId") int id) {

        //borra notificacion
        notificacionService.deleteById(id);

        //redirecciona a la lista de Notificaciones
        return "redirect:/notificacion/lista-notificaciones";
    }
}
