package lorenzofoschetti.u5d5.repositories;

import lorenzofoschetti.u5d5.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PostazioneRepository extends JpaRepository<Postazione, UUID> {
}
