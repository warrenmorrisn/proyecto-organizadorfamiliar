package ar.gob.siliconmisiones.organizadorfamiliar.controller;

import ar.gob.siliconmisiones.organizadorfamiliar.entity.Role;
import ar.gob.siliconmisiones.organizadorfamiliar.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {

    private RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/lista")
    public String ListaRole(Model model) {
        List<Role> roles = roleService.findAll();
        model.addAttribute("role", roles);

        return "role/lista-roles";
    }

    @GetMapping("/nuevoRole")
    public String nuevoRole(Model model) {

        Role role = new Role();

        model.addAttribute("role",role);

        return "role/lista-roles";
    }

    @GetMapping("modificarRole")
    public String modificarRole(@RequestParam("usuarioId") int id, Model model) {

        Role role = roleService.findById(id);

        model.addAttribute("role",role);

        return "role/lista-roles";
    }

    @PostMapping("/guardarRole")
    public String guardarRole(@ModelAttribute("role") Role role) {

        roleService.save(role);

        return "redirect:/role/lista-roles";
    }

    @GetMapping("/borrarRole")
    public String borrarRole(@RequestParam("roleId") int id) {
        roleService.deleteById(id);

        return "redirect:/role/lista-roles";
    }

}
