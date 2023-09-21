package fr.discordlike.discordlike.controller.api;

import fr.discordlike.discordlike.models.User;
import fr.discordlike.discordlike.repo.UserRepo;
import fr.discordlike.discordlike.request.UserRequest;
import fr.discordlike.discordlike.response.UserResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserApiController
{
    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public UserResponse add(@RequestBody UserRequest request)
    {
        User user = new User(); // création d'un objet User
        BeanUtils.copyProperties(user, request);// ajout en Base de donnée depuis le Request

        this.userRepo.save(user);

        return UserResponse.builder() // ce que me retourne le Request : Response
                .username(user.getUsername())
                .password(user.getPassword())
                .build();
    }


    

}