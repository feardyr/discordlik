package fr.discordlike.discordlike.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SalonResponse {
    private int id;
    private String name;
    private String description;
    private int serverId;
}
