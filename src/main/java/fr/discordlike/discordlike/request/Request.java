package fr.discordlike.discordlike.request;



import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Request {
    @NotBlank
    private String username;

    private String password;

    private String message;



}
