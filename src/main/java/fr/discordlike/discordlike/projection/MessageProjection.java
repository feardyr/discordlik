package fr.discordlike.discordlike.projection;

import java.time.LocalDate;

public interface MessageProjection {
    public int getMessage_id();
    public int getUser_id();
    public String getUserName();
    public String getMessage();
    public LocalDate getDate();
}
