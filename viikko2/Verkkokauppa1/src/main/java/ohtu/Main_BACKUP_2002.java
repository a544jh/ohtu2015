package ohtu;

import ohtu.verkkokauppa.Kauppa;
import ohtu.verkkokauppa.Kirjanpito;
<<<<<<< HEAD
=======
import ohtu.verkkokauppa.Pankki;
import ohtu.verkkokauppa.Varasto;
import ohtu.verkkokauppa.Viitegeneraattori;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
>>>>>>> c74189ff4c11ba2fc6fd8082398b0d4c833dd73d

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
        Kauppa kauppa = new Kauppa();
=======
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/spring-context.xml");
        
 Kirjanpito kirjanpito      = ctx.getBean(Kirjanpito.class);
Varasto varasto            = ctx.getBean(Varasto.class);
Pankki pankki              = ctx.getBean(Pankki.class);
Viitegeneraattori viitegen = ctx.getBean(Viitegeneraattori.class);
 Kauppa kauppa = ctx.getBean(Kauppa.class);
>>>>>>> c74189ff4c11ba2fc6fd8082398b0d4c833dd73d

        // kauppa hoitaa yhden asiakkaan kerrallaan seuraavaan tapaan:
        kauppa.aloitaAsiointi();
        kauppa.lisaaKoriin(1);
        kauppa.lisaaKoriin(3);
        kauppa.lisaaKoriin(3);
        kauppa.poistaKorista(1);
        kauppa.tilimaksu("Pekka Mikkola", "1234-12345");

        // seuraava asiakas
        kauppa.aloitaAsiointi();
        for (int i = 0; i < 24; i++) {
            kauppa.lisaaKoriin(5);
        }

        kauppa.tilimaksu("Arto Vihavainen", "3425-1652");

        // kirjanpito
<<<<<<< HEAD
        for (String tapahtuma : Kirjanpito.getInstance().getTapahtumat()) {
=======
        for (String tapahtuma : kirjanpito.getTapahtumat()) {
>>>>>>> c74189ff4c11ba2fc6fd8082398b0d4c833dd73d
            System.out.println(tapahtuma);
        }
    }
}
