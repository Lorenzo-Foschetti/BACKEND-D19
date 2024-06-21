package lorenzofoschetti.u5d5.services;


import lombok.extern.slf4j.Slf4j;
import lorenzofoschetti.u5d5.entities.Utente;
import lorenzofoschetti.u5d5.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UtenteService {

    @Autowired
    private UtenteRepository utenteRepository;

    public void saveUtente(Utente newUtente) {
        utenteRepository.save(newUtente);
        log.info("Nuovo utente salvato nel database!");
    }

}
