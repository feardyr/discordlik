package fr.discordlike.discordlike.api;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.discordlike.discordlike.model.Message;
import fr.discordlike.discordlike.repo.MessageRepository;
import fr.discordlike.discordlike.request.MessageRequest;
import fr.discordlike.discordlike.response.MessageResponse;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/chat")
public class MessageApi {
    @Autowired
    private MessageRepository repoMessage;
    // @Autowired
    // private MessageRequest requestMessage;


   @PostMapping
    public MessageResponse add(@RequestBody MessageRequest request)
    {
        Message conv = new Message(); // création d'un objet User
        conv.setMessage(request.getMessage());
        conv.setNom_utilisateur(request.getUsername());
        conv.setMessage_id(request.getMessage_id());
        conv.setUser_id(request.getUser_id());
        conv.setTime(request.getTime());
        BeanUtils.copyProperties(conv, request);// ajout en Base de donnée depuis le Request
        
        this.repoMessage.save(conv);
      

        return MessageResponse.builder() // ce que me retourne le Request : Response
                .username(conv.getNom_utilisateur())
                .message(conv.getMessage())
                .time(conv.getTime())
                .user_id(conv.getUser_id())
                .message_id(conv.getMessage_id())
                .build();
    }   


        @GetMapping
            public List<Message> findAll(){
                return this.repoMessage.findAll();
                        
            }


    // @GetMapping("/api/chat/{id}")
    // public MessageResponse findById(@PathVariable int id) {
    //     Optional<Message> message = this.repoMessage.findById(id);
    //     MessageResponse resp = new MessageResponse();

    //     BeanUtils.copyProperties(message, resp);

    //     return resp;

    //     // return ProduitResponse.builder()
    //     //     .id(produit.getId())
    //     //     .nom(produit.getNom())
    //     //     .prix(produit.getPrix())
    //     //     .fournisseurId(produit.getFournisseur().getId())
    //     //     .fournisseurNom(produit.getFournisseur().getNom())
    //     //     .build();
    // }

    // @GetMapping("/{id}")
    // public MessageProjection findByIdProjected(@PathVariable int id) {
    //    // return this .repoMessage.findByIdProjected(id, MessageProjection.class);
    // }
}
