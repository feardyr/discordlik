package fr.discordlike.discordlike.request;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ConvRequest {

    List<MessageRequest> conversation ;

    public void addConv(MessageRequest conv){
        this.conversation.add(conv); 
    }
}
