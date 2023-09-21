package fr.discordlike.discordlike.response;

import lombok.*;

@Getter@Setter@Builder@NoArgsConstructor@AllArgsConstructor
public class UserResponse {
    private int id;
    private String username;
    private String password;
}