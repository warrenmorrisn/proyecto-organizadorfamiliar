package ar.gob.siliconmisiones.organizadorfamiliar.controller;

import ar.gob.siliconmisiones.organizadorfamiliar.entity.Grupo;
import ar.gob.siliconmisiones.organizadorfamiliar.service.GrupoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/grupo")
public class GrupoController {

    private GrupoService grupoService;

    public GrupoController(GrupoService grupoService) {
        this.grupoService = grupoService;
    }

    @GetMapping("/lista")
    public String ListaGrupo(Model model) {
        List<Grupo> grupos = grupoService.findAll();

        model.addAttribute("grupos",grupos);

        return "grupos/lista-usuarios";
    }

    @GetMapping("/nuevoGrupo")
    public String nuevoGrupo(Model model) {
        Grupo grupo = new Grupo();

        model.addAttribute("grupo", grupo);

        return "grupo/lista-grupo";
    }

    @GetMapping("/modificarGrupo")
    public String modificarGrupo(@RequestParam("grupoId") int id, Model model) {
        Grupo grupo = grupoService.findById(id);

        model.addAttribute("grupo",grupo);

        return "grupo/lista-grupo";
    }

    @PostMapping("/guardarGrupo")
    public String guardarGrupo(@ModelAttribute("grupo") Grupo grupo) {
        grupoService.save(grupo);

        return "redirect:/grupo/lista-grupo";
    }

    @GetMapping("/borrarGrupo")
    public String borrarGrupo(@RequestParam("grupoId") int id) {

        grupoService.deleteById(id);

        return "redirect:/grupo/lista-grupo";
    }

}
