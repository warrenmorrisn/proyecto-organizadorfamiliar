package ar.gob.siliconmisiones.organizadorfamiliar.dao;

import ar.gob.siliconmisiones.organizadorfamiliar.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "roles")
public interface RoleRepository extends JpaRepository<Role,Integer> {
}
