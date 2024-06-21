package lorenzofoschetti.u5d5.repositories;

import lorenzofoschetti.u5d5.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UtenteRepository extends JpaRepository<Utente, UUID> {


    //anche questa query creata per essere implementata nel metodo save dell'utente
    boolean existsByEmailAndUsername(String email, String username);
}
