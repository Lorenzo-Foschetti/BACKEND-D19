package lorenzofoschetti.u5d5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Edificio {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;
    private String name;
    private String address;
    private String city;
    @OneToMany(mappedBy = "edificio")
    private List<Postazione> postazioni;

    public Edificio(String name, String address, String city, List<Postazione> postazioni) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.postazioni = postazioni;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
