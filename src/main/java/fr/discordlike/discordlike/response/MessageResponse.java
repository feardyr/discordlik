package fr.discordlike.discordlike.response;

import java.sql.Date;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Builder 
@Setter @NoArgsConstructor @AllArgsConstructor
public class MessageResponse {
    private int message_id;
    private int user_id;
    private String username;
    private String message;
    private LocalDate time = LocalDate.now() ; 
}
