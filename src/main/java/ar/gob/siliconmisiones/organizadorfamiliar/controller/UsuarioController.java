package ar.gob.siliconmisiones.organizadorfamiliar.controller;

import ar.gob.siliconmisiones.organizadorfamiliar.entity.Usuario;
import ar.gob.siliconmisiones.organizadorfamiliar.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/lista")
    public String ListaUsuarios(Model model) {
        List<Usuario> usuarios = usuarioService.findAll();

        model.addAttribute("usuarios",usuarios);

        return "usuario/lista-usuarios";
    }

    @GetMapping("/nuevoUsuario")
    public String nuevoUsuario(Model model) {

        Usuario usuario = new Usuario();

        model.addAttribute("usuario",usuario);

        return "usuario/lista-usuarios";
    }

    @GetMapping("/modificarUsuario")
    public String modificarUsuario(@RequestParam("usuarioId") int id, Model model) {

        //obtiene el usuario de servicio
        Usuario usuario = usuarioService.findById(id);

        //se settea a usuario como un atributo de model para precargar el formulario
        model.addAttribute("usuario",usuario);

        //redirecciona a la lista de usuarios
        return "usuario/lista-usuarios";
    }

    @PostMapping("/guardarUsuario")
    public String guardarUsuario(@ModelAttribute("usuario") Usuario usuario) {

        //Guarda el usuario
        usuarioService.save(usuario);

        //se utiliza el redirect para prevenir duplicacion de submissions
        return "redirect:/usuario/lista-usuarios";
    }

    @GetMapping("/borrarUsuario")
    public String borrarUsuario(@RequestParam("usuarioId") int id) {

        //borra el usuario
        usuarioService.deleteById(id);

        //redirecciona a la lista de usuarios
        return "redirect:/usuario/lista-usuarios";
    }
}
