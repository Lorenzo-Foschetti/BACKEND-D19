package lorenzofoschetti.u5d5.services;

import lombok.extern.slf4j.Slf4j;
import lorenzofoschetti.u5d5.entities.Postazione;
import lorenzofoschetti.u5d5.enums.Tipo;
import lorenzofoschetti.u5d5.repositories.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PostazioneService {

    @Autowired
    private PostazioneRepository postazioneRepository;

    public void savePostazione(Postazione newPostazione) {
        postazioneRepository.save(newPostazione);
        log.info("Postazione salvata correttamente nel Database!");
    }

    public List<Postazione> findByTipoAndCity(Tipo tipo, String city) {
        return postazioneRepository.findByTipoAndCity(tipo, city);
    }
}
