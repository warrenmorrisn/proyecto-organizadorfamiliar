package ar.gob.siliconmisiones.organizadorfamiliar.rest;


import ar.gob.siliconmisiones.organizadorfamiliar.dao.UsuarioDAO;
import ar.gob.siliconmisiones.organizadorfamiliar.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {

    private UsuarioDAO usuarioDAO;

    //Injext employee dao (use constructor injectio)
    @Autowired
    public UsuarioRestController(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    //Expose "/usuario and return list of usuarios
    @GetMapping("/Usuario")
    public List<Usuario> findAll() {
        return usuarioDAO.findAll();
    }

    @Controller
    public class GreetingController {

        @GetMapping("/greeting")
        public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
            model.addAttribute("name", name);
            return "./mi_perfil/miPerfil";
        }

    }

}
