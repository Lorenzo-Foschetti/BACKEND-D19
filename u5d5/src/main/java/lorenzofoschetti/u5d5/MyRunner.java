package lorenzofoschetti.u5d5;


import lorenzofoschetti.u5d5.services.EdificioService;
import lorenzofoschetti.u5d5.services.PostazioneService;
import lorenzofoschetti.u5d5.services.PrenotazioneService;
import lorenzofoschetti.u5d5.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired

    private AnnotationConfigApplicationContext context;
    @Autowired

    private EdificioService edificioService;
    @Autowired
    private PostazioneService postazioneService;
    @Autowired
    private PrenotazioneService prenotazioneService;
    @Autowired
    private UtenteService utenteService;

    @Override
    public void run(String... args) throws Exception {
////        Edificio primoEdificio = context.getBean("primoEdificio", Edificio.class);
////        edificioService.saveEdificio(primoEdificio);
//
//        //  Edificio primoEdificio = new Edificio("Primo Edificio", "Via Roma 80", "Roma");
////        edificioService.saveEdificio(primoEdificio);
//        Edificio secondoEdificio = new Edificio("Secondo Edificio", "Via dei pini 90", "Palermo");
//
//        //  Postazione primaPostazione = new Postazione("bellissima", Tipo.PRIVATO, 20, primoEdificio);
////       postazioneService.savePostazione(primaPostazione);
//
//        Postazione secondaPostazione = new Postazione("carina", Tipo.OPENSPACE, 30, secondoEdificio);
////
//////
//        Utente primoUtente = new Utente("cicciobello", "Andrea Rossi", "AndreaRossi@gmail.com");
////        // utenteService.saveUtente(primoUtente);


    }
}
