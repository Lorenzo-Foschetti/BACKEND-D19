package lorenzofoschetti.u5d5.services;

import lombok.extern.slf4j.Slf4j;
import lorenzofoschetti.u5d5.repositories.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PostazioneService {

    @Autowired
    private PostazioneRepository postazioneRepository;
}
