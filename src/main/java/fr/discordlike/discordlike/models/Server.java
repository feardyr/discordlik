package fr.discordlike.discordlike.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Server {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "server")
    private List<Salon> salons;
}