package lorenzofoschetti.u5d5.repositories;

import lorenzofoschetti.u5d5.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EdificioRepository extends JpaRepository<Edificio, UUID> {
}
