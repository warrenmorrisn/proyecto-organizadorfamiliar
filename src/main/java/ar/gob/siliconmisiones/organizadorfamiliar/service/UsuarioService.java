package ar.gob.siliconmisiones.organizadorfamiliar.service;
import ar.gob.siliconmisiones.organizadorfamiliar.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> findAll();

    public Usuario findById(int id);

    public void save(Usuario usuario);

    public void deleteById(int id);

}
