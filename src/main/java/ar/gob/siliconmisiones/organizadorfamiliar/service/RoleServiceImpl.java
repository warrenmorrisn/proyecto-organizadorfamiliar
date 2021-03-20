package ar.gob.siliconmisiones.organizadorfamiliar.service;

import ar.gob.siliconmisiones.organizadorfamiliar.dao.RoleRepository;
import ar.gob.siliconmisiones.organizadorfamiliar.entity.Role;
import ar.gob.siliconmisiones.organizadorfamiliar.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findById(int id) {
        Optional<Role> result = roleRepository.findById(id);

        Role role = null;

        if (result.isPresent()) {
            role = result.get();
        } else {
            throw new RuntimeException("No se encontro el usuario con el id: " + id);
        }

        return role;
    }

    @Override
    public void save(Role role) {
        roleRepository.save(role);
    }

    @Override
    public void deleteById(int id) {
        roleRepository.deleteById(id);
    }
}
