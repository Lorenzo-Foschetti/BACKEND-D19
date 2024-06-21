package lorenzofoschetti.u5d5.services;


import lombok.extern.slf4j.Slf4j;
import lorenzofoschetti.u5d5.entities.Edificio;
import lorenzofoschetti.u5d5.repositories.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EdificioService {

    @Autowired
    private EdificioRepository edificioRepository;

    public void saveEdificio(Edificio newEdificio) {
        edificioRepository.save(newEdificio);
        log.info("Nuovo edificio salvato correttamente nel Database!");
    }

    
}
