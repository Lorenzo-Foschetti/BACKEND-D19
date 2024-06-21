package lorenzofoschetti.u5d5.entities;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lorenzofoschetti.u5d5.enums.Tipo;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Postazione {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;
    private String description;
    private Tipo tipo;
    private int numeroMaxOccupanti;
    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;
    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> prenotazioni;

    public Postazione(String description, Tipo tipo, int numeroMaxOccupanti, Edificio edificio) {
        this.description = description;
        this.tipo = tipo;
        this.numeroMaxOccupanti = numeroMaxOccupanti;
        this.edificio = edificio;
    }

    @Override
    public String toString() {
        return "Postazione{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", tipo=" + tipo +
                ", numeroMaxOccupanti=" + numeroMaxOccupanti +
                ", edificio=" + edificio +
                '}';
    }
}
