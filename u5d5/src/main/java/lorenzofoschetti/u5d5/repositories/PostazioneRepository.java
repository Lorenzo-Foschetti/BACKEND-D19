package lorenzofoschetti.u5d5.repositories;

import lorenzofoschetti.u5d5.entities.Postazione;
import lorenzofoschetti.u5d5.enums.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface PostazioneRepository extends JpaRepository<Postazione, UUID> {


    @Query("SELECT p FROM Postazione p WHERE p.tipo = :tipo AND p.edificio.city = :city")
    List<Postazione> findByTipoAndCity(Tipo tipo, String city);
}
