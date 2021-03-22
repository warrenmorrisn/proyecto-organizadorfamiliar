package ar.gob.siliconmisiones.organizadorfamiliar.controller;

import ar.gob.siliconmisiones.organizadorfamiliar.entity.Grupo;
import ar.gob.siliconmisiones.organizadorfamiliar.entity.Usuario;
import ar.gob.siliconmisiones.organizadorfamiliar.service.GrupoService;
import ar.gob.siliconmisiones.organizadorfamiliar.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class IndexController{
@GetMapping("/")
public String index(Model model) {

        return "index";
        }
}