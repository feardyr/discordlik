package fr.discordlike.discordlike.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.discordlike.discordlike.model.Message;
import fr.discordlike.discordlike.repo.MessageRepository;

@Controller
@RequestMapping("/conv")
public class MessageController {
    @Autowired
    private MessageRepository messageRepository;

    
    @GetMapping("/omg")
    public String Conv(Model model){
        List<Message> conv = this.messageRepository.findAll()    ;
        model.addAttribute("message", conv);
      
        return "index";
    }
    
@PostMapping("/moi")
public String postHello2(@RequestParam("message") String messageText, Model model) {
    // Créez une instance de Message et définissez le texte du message
    Message message = new Message();
    message.setMessage(messageText);

    // Enregistrez le message dans la base de données en utilisant le MessageRepository
    messageRepository.save(message);

    // Vous pouvez également récupérer d'autres données de la requête si nécessaire

    // Redirigez l'utilisateur vers la page d'accueil ou une autre vue après l'envoi du message
    return "redirect:/conv/omg";
}
    
   

}
