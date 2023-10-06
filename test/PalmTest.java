import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {

    Plantor rolf = new Palm(10, "rolf");
    Plantor laura = new Palm(5,"laura");

    Plantor olof = new Palm(1,"olof");

   //gör inga tester för kaktus pga finns inget att "räkna ut" där

    @Test                                //annotering, meddelande till kompilator vilken typ av metod!
    void calculateMedSuperAnrop() {     //vill testa att anropa superklassens setVätskebehov, dess parameter får vara vårt mattetal! (detta är vad calculateVätska gör)
        rolf.CalculateVätska();       //CalculateVätska för rolf, nu ska dess behov av vätska vara 5 liter!
        assert rolf.getVätskebehov() == 5;                      //det verkade fungerar! testet gick igenom
       // assert rolf.getVätskebehov() == 3;             //detta ska bli fel, måste testa att det blir fel så inte det är något fel på testet, det blev fel när man tar bort kommentar


        laura.CalculateVätska();                             //kallar på samma metod för laura
        assert laura.getVätskebehov() == 2.5;               //det stämmer att den funkar för laura också, som har samma värde som i "riktiga" objektet
        laura.setVätskebehov(2);                           //sätter nu vätskebehov till 2! detta testar setVätskebehov metoden också
        assert laura.getVätskebehov() != 2.5;                //testar att det INTE är lika med 2.5 fortfarande, verkar stämma
        assert laura.getVätskebehov() == 2;                 //stämmer
        laura.CalculateVätska();
        assert laura.getVätskebehov() == 2.5;

        olof.CalculateVätska();                      //stämmer för olof också!
        assert olof.getVätskebehov() == 0.5;
        }
    }