package ar.gob.siliconmisiones.organizadorfamiliar.dao;

import ar.gob.siliconmisiones.organizadorfamiliar.entity.Usuario;
import java.util.List;

public interface UsuarioDAO {
    public List<Usuario> findAll();

}
