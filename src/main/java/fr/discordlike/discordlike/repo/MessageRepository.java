package fr.discordlike.discordlike.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import fr.discordlike.discordlike.model.Message;



public interface MessageRepository extends JpaRepository<Message, Integer> {

  //  MessageProjection findByIdProjected(int id, Class<MessageProjection> class1);
    
    // @Query("select m from message m where m.message_id = ?1")
    // public  Optional<Message>  findByMessage_id(int message_id); //fiList<Message>

    // public  Optional<Message>  findByNom_utilisateur(String nom_utilisateur); //fiList<Message>

}
