package ar.gob.siliconmisiones.organizadorfamiliar.controller;

import ar.gob.siliconmisiones.organizadorfamiliar.entity.Tarea;
import ar.gob.siliconmisiones.organizadorfamiliar.service.TareaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tarea")
public class TareaController {

    private TareaService tareaService;

    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    @GetMapping("/lista")
    public String ListaTarea(Model model) {
        List<Tarea> tareas = tareaService.findAll();

        model.addAttribute("tareas",tareas);

        return "tarea/lista-tareas";
    }

    @GetMapping("/nuevaTarea")
    public String nuevaTarea(Model model) {

        Tarea tarea = new Tarea();

        model.addAttribute("tarea", tarea);

        return "tarea/lista-tareas";
    }

    @GetMapping("/modificarTarea")
    public String modificarTarea(@RequestParam("tareaId") int id, Model model) {

        //obtiene la tarea de servicio
        Tarea tarea = tareaService.findById(id);

        //se settea la tarea como un atributo de model para precargar el formulario
        model.addAttribute("tarea",tarea);

        //redirecciona a la lista de notificaciones
        return "tarea/lista-tareas";
    }

    @PostMapping("/guardarTarea")
    public String guardarTarea(@ModelAttribute("tarea") Tarea tarea) {

        //Guarda la tarea
        tareaService.save(tarea);

        //se utiliza eltarea redirect para prevenir duplicacion de submissions
        return "redirect:/#";
    }

    @GetMapping("/borrarTarea")
    public String borrarTarea(@RequestParam("tareaId") int id) {

        //borra la tarea
        tareaService.deleteById(id);

        //redirecciona a la lista de tareas
        return "redirect:/tarea/lista-tareas";
    }

}
