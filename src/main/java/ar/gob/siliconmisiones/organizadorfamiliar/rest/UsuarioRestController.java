package ar.gob.siliconmisiones.organizadorfamiliar.rest;


import ar.gob.siliconmisiones.organizadorfamiliar.dao.UsuarioDAO;
import ar.gob.siliconmisiones.organizadorfamiliar.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
