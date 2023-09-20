package fr.discordlike.discordlike.request;

import java.sql.Date;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MessageRequest {
    private LocalDate time;

    private String texte;
}
