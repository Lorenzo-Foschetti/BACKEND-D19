package lorenzofoschetti.u5d5.services;


import lombok.extern.slf4j.Slf4j;
import lorenzofoschetti.u5d5.entities.Prenotazione;
import lorenzofoschetti.u5d5.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public void savePrenotazione(Prenotazione newPrenotazione) {
        prenotazioneRepository.save(newPrenotazione);
        log.info("Nuova prenotazione salvata con successo!!!");
    }


}
