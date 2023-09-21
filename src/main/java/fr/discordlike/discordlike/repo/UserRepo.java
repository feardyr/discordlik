package fr.discordlike.discordlike.repo;

import fr.discordlike.discordlike.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
