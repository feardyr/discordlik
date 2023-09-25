package fr.discordlike.discordlike.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter@Setter
public class Salon {

    @Id@GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;


    @ManyToOne
    private Server server;
}
