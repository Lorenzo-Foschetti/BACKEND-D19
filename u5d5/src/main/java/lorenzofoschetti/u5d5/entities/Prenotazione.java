package lorenzofoschetti.u5d5.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Prenotazione {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID ID;

    private LocalDate dataDiPrenotazione;
    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "postazione_id")
    private Postazione postazione;

    public Prenotazione(LocalDate dataDiPrenotazione, Utente utente, Postazione postazione) {
        this.dataDiPrenotazione = dataDiPrenotazione;
        this.utente = utente;
        this.postazione = postazione;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "ID=" + ID +
                ", dataDiPrenotazione=" + dataDiPrenotazione +
                ", utente=" + utente +
                ", postazione=" + postazione +
                '}';
    }
}
