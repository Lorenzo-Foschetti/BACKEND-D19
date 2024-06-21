//package lorenzofoschetti.u5d5;
//
//HO COMMENTATO IBEAN IN QUANTO MI DAVA ERRORE,ED ANDRO' A CREARE I MIEI TUTENTI, EDIFICI ECC DIRETTAMENTE NEL RUNNER


//import lorenzofoschetti.u5d5.entities.Edificio;
//import lorenzofoschetti.u5d5.entities.Postazione;
//import lorenzofoschetti.u5d5.entities.Prenotazione;
//import lorenzofoschetti.u5d5.entities.Utente;
//import lorenzofoschetti.u5d5.enums.Tipo;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.util.Arrays;
//
//@Configuration
//public class BeansConfig {
//
//    @Bean
//    public Postazione primaPostazione() {
//        return new Postazione("Confortevole", Tipo.OPENSPACE, 10, primoEdificio());
//    }
//
//    @Bean
//    public Postazione secondaPostazione() {
//        return new Postazione("Fantastica postazione", Tipo.SALARIUNIONI, 15, primoEdificio());
//    }
//
//    @Bean
//    public Postazione terzaPostazione() {
//        return new Postazione("Carina", Tipo.PRIVATO, 8, secondoEdificio());
//    }
//
//    @Bean(name = "primoEdificio")
//    public Edificio primoEdificio() {
//        return new Edificio("Primo edificio", "via dei pini 8", "Milano", Arrays.asList(primaPostazione(), secondaPostazione()));
//    }
//
//    @Bean
//    public Edificio secondoEdificio() {
//        return new Edificio("Secondo edificio", "Via rossi 9", "Palermo", Arrays.asList(terzaPostazione()));
//    }
//
//    @Bean
//    public Prenotazione primaPrenotazione() {
//        return new Prenotazione(LocalDate.now(), primoUtente(), primaPostazione());
//    }
//
//    @Bean
//    public Prenotazione secondaPrenotazione() {
//        return new Prenotazione(LocalDate.of(2024, 7, 10), secondoUtente(), terzaPostazione());
//    }
//
//    @Bean
//    public Utente primoUtente() {
//        return new Utente("Cicciobello000", "Andrea Rossi", "andreaR@libero.it", Arrays.asList(primaPrenotazione()));
//    }
//
//    @Bean
//    public Utente secondoUtente() {
//        return new Utente("Topolino350", "Marco Verdi", "MarcoV@gmail.com", Arrays.asList(secondaPrenotazione()));
//    }
//}
