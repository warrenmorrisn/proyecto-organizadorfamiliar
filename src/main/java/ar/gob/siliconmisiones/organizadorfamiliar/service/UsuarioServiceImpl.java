package ar.gob.siliconmisiones.organizadorfamiliar.service;

import ar.gob.siliconmisiones.organizadorfamiliar.dao.UsuarioRepository;
import ar.gob.siliconmisiones.organizadorfamiliar.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(int id) {
        Optional<Usuario> result = usuarioRepository.findById(id);

        Usuario usuario = null;

        if (result.isPresent()) {
            usuario = result.get();
        } else {
            throw new RuntimeException("No se encontro el usuario con el id: " + id);
        }

        return usuario;
    }

    @Override
    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void deleteById(int id) {
        usuarioRepository.deleteById(id);
    }
}
