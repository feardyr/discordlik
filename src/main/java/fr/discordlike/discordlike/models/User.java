package fr.discordlike.discordlike.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class User {
    @Id
    private int id;

    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;


    public User() {
    }

    public User(String username, String password, String email, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    //to do
    // objet server
    // objet salon





}

