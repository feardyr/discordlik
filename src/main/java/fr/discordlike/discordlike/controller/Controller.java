package fr.discordlike.discordlike.controller;

import fr.discordlike.discordlike.DiscordlikeApplication;
import fr.discordlike.discordlike.models.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class Controller {
private DiscordlikeApplication discordlikeApplication;


    public Controller(DiscordlikeApplication discordlikeApplication) {
        this.discordlikeApplication = discordlikeApplication;
    }
    @GetMapping("/")
    public String listUser (Model model)
    {
        List<User> users = discordlikeApplication.listUser();
        model.addAttribute("users", users);
        return "index";
    }

}
