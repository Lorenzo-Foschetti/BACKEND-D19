package lorenzofoschetti.u5d5.repositories;

import lorenzofoschetti.u5d5.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, UUID> {
}
