package fr.discordlike.discordlike.model;


import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Table;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
@Table(name="message")
@Getter @Setter
public class Message {
    @Id // Obligatoire sur chaque entité
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incrément
    @Column(name = "message_id")
    private int message_id;
    
    private int user_id;
    private String nom_utilisateur;

    private String message;

    private LocalDate time = LocalDate.now() ; 
}
