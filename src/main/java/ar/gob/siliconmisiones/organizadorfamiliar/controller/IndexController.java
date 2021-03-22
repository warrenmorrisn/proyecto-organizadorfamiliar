package ar.gob.siliconmisiones.organizadorfamiliar.controller;

import ar.gob.siliconmisiones.organizadorfamiliar.entity.Grupo;
import ar.gob.siliconmisiones.organizadorfamiliar.entity.Tarea;
import ar.gob.siliconmisiones.organizadorfamiliar.entity.Usuario;
import ar.gob.siliconmisiones.organizadorfamiliar.service.GrupoService;
import ar.gob.siliconmisiones.organizadorfamiliar.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class IndexController{
@GetMapping("/")
public String index(Model model) {

        return "index";
        }

        @GetMapping("/users")
        public String users(Model model) {
                return "users";
        }

        @GetMapping("/user-edit")
        public String userEdit(Model model) {
                return "user-edit";
        }

        @GetMapping("/login")
        public String login(Model model) {
                return "login";
        }

        @GetMapping("/email-verification")
        public String emailVerification(Model model) {
                return "email-verification";
        }

        @GetMapping("/new-task")
        public String newTask(Model model) {
                return "new-task";
        }

        @GetMapping("/password-reset")
        public String passwordReset(Model model) {
                return "password-reset";
        }

        @GetMapping("/password-reset-2")
        public String passwordReset2(Model model) {
                return "password-reset-2";
        }

        @GetMapping("/register")
        public String register(Model model) {
                return "register";
        }

        @GetMapping("/settings")
        public String settings(Model model) {
                return "settings";
        }

        @GetMapping("/static-non-auth")
        public String staticNonAuth(Model model) {
                return "static-non-auth";
        }

        @GetMapping("/task-edit")
        public String taskEdit(Model model) {
                return "task-edit";
        }


}