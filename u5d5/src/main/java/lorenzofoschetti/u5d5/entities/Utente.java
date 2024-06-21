package lorenzofoschetti.u5d5.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Utente {
    @Id
    @GeneratedValue


    private UUID ID;

    private String userName;

    private String nameAndSurname;

    private String email;


    @OneToMany(mappedBy = "utente")
    private List<Prenotazione> prenotazioni;

    public Utente(String userName, String nameAndSurname, String email) {
        this.userName = userName;
        this.nameAndSurname = nameAndSurname;
        this.email = email;

    }

    @Override
    public String toString() {
        return "Utente{" +
                "email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", nameAndSurname='" + nameAndSurname + '\'' +
                ", ID=" + ID +
                '}';
    }
}
