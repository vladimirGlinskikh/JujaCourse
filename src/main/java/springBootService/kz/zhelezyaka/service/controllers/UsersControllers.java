package springBootService.kz.zhelezyaka.service.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersControllers {
    @GetMapping("/users")
    public String getUsersPage(ModelMap model) {
        model.addAttribute("userName", "Vladimir");
        return "users";
    }
}
