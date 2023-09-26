package fr.discordlike.discordlike.controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.discordlike.discordlike.api.MessageApi;
import fr.discordlike.discordlike.request.MessageRequest;
import fr.discordlike.discordlike.request.Request;

@org.springframework.stereotype.Controller
public class Controller {
     @GetMapping("/chat")
    public String hello(Model model){
        model.addAttribute("user", "Jerem");
        model.addAttribute("password", "mdp");
        model.addAttribute("message", "un texte pour l'exemple");


        return "index";
    }

    
    @GetMapping("/chat/{usr}")
    public String helloPv (@PathVariable(name ="usr") String username, Model model){
        model.addAttribute("user", username);

        return "index";
    }
    @GetMapping("/chat/{pwd}")
    public String helloPwd (@PathVariable(name ="pwd") String password, Model model){
        model.addAttribute("password", password);

        return "index";
    }
@GetMapping("/chat/{texte}")
    public String helloTexte (@PathVariable(name ="texte") String message, Model model){
        model.addAttribute("message", message);

        return "index";
    }

    @PostMapping("/chat")
    public String postHello(Request request, Model model){
        model.addAttribute("user", request.getUsername());
        model.addAttribute("password",  request.getPassword());
        model.addAttribute("message",  request.getMessage());

        



        return "index";
    }


    private MessageRequest request;

    @GetMapping("/test")
    public String hello2(Model model){
        
       //  int message_id = request.getMessage_id();
        model.addAttribute("message", "azertyuio");
        model.addAttribute("message_id", 25);
        model.addAttribute("user_id", 4);

        // MessageApi test = new MessageApi();
       // request.getMessage();
       // test.add(request);
        return "index";
    }

    
    @PostMapping("/test")
    public String postHello2(MessageRequest request, Model model){
        model.addAttribute("message", request.getMessage());
        model.addAttribute("message_id",  request.getMessage_id());
        model.addAttribute("user_id",  request.getUser_id());
        model.addAttribute("username",  request.getUsername());

        



        return "index";
    }
}



