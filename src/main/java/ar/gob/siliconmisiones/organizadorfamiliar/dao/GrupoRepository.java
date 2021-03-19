package ar.gob.siliconmisiones.organizadorfamiliar.dao;

import ar.gob.siliconmisiones.organizadorfamiliar.entity.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "grupos")
public interface GrupoRepository extends JpaRepository<Grupo, Integer> {
}
