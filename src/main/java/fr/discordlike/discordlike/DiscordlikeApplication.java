package fr.discordlike.discordlike;

import fr.discordlike.discordlike.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DiscordlikeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscordlikeApplication.class, args);
		System.out.println("Hello world");
	}

public List<User> listUser() {
		List<User> users = new ArrayList<>();
		/*
		users.add(new User("toto", "toto"));
		users.add(new User("titi", "titi"));
		users.add(new User("tata", "tata"));
*/
return users;

	}



}
