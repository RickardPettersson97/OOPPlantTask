import javax.swing.*;
import java.util.*;

/** egna reflektioner: gillade uppgiften, men känner själv att jag kanske borde ha haft lite mindre kod i HuvudProgram konstruktorn... kanske lagt till en extra klass där jag hanterar input?
 * funderade på att göra en metod i superklassen Plantor som printade ut texten, istället för att ha den i varje subklass (känns lite repetivt) men beslutade att spara som den är!
 * hade originellt vätskebehov variabeln i varje subklass i sig, men gjorde om det till en variabel i superklassen. Förutom i Kakatus pga det är en final variabel som är 2, den ändras ju inte beroende på storlek!
 * hade ett jätte intressant problem om meatloaf hade varit 0.4 meter hög, hittade det genom tester... om man inte hade string formatet till 2 decimaler hade det stått ungefär 0.18000000000000002 liter
*/
public class HuvudProgram{


 HuvudProgram() {                            //när huvudprogram konstruktorn körs, körs själva "programmet"

     ArrayList<Plantor> plantLista = new ArrayList<>();

     Plantor laura = new Palm(5, "Laura");                         //skapar objekt av subklasser (Palm, Kaktus,Köttätandeväxt) men refernstyp är superklass (Plantor) ärver höjd och namn variabler.
     Plantor igge = new Kaktus(0.2, "Igge");
     Plantor meatloaf = new KöttätandeVäxt(0.7, "Meatloaf");
     Plantor olof = new Palm(1,"Olof");

     plantLista.add(laura);                                //lägger in objekten vi skapat i vår lista
     plantLista.add(igge);
     plantLista.add(meatloaf);
     plantLista.add(olof);

     Plantor temp = null;         //ny refernsvariabel temp av typen Plantor, pekar inte på något i minnet
     boolean found = false;      //boolean found är först false


     while (!found) {                                                              //while loop som kör tills man matat in rätt namn, eller då man trycker på "X" eller cancel.
         String input = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
         if (input == null)
             System.exit(0);
         try {
             for (Plantor objekt : plantLista)
                 if (input.equalsIgnoreCase(objekt.getName())) {
                     found = true;
                     temp = objekt;                        //temp variabeln pekar nu på samma objekt som laura, igge, meatloaf eller olof pekar på!
                     break;
                 }
             if (!found)
                 throw new Exception();
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Finns ingen växt med det namnet");
         }
     }
     
        //polymorphism förekommer, kallar på olika metoder beroende på objektet, fast det är samma metodanrop och metoderna har samma namn och referenstyp (alla är Plantor)
        temp.CalculateVätska();
        temp.PrintVätska();

 }

    public static void main(String[] args) {   //programmet startar alltid i main metoden, men den har inte åtkomst till HuvudProgram klassens variabler eller metoder!


        HuvudProgram main = new HuvudProgram();         //skapar upp instans av klassen huvudprogram, bryter sig ur statisk kontext!

        }
    }