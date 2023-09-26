package fr.discordlike.discordlike.request;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MessageRequest {


    private int message_id;
    private int user_id;
    private String username;
    private String message;
    private LocalDate time = LocalDate.now() ; 


}
