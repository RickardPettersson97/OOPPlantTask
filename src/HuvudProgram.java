import javax.swing.*;
import java.util.*;



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

    public static void main(String[] args) {


        HuvudProgram main = new HuvudProgram();         //skapar upp instans av klassen huvudprogram, bryter sig ur statisk kontext!

        }
    }