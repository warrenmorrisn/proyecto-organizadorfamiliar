package ar.gob.siliconmisiones.organizadorfamiliar.service;

import ar.gob.siliconmisiones.organizadorfamiliar.entity.Grupo;
import ar.gob.siliconmisiones.organizadorfamiliar.entity.Role;

import java.util.List;

public interface RoleService {

    public List<Role> findAll();

    public Role findById(int id);

    public void save(Role role);

    public void deleteById(int id);
}
