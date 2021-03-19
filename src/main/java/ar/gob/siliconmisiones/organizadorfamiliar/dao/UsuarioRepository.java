package ar.gob.siliconmisiones.organizadorfamiliar.dao;

import ar.gob.siliconmisiones.organizadorfamiliar.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "usuarios")
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
