abstract public class Plantor implements Vätska {              //abstrakt pga finns inte några objekt som är "bara" plantor, de är alla något mer
     //dessa variabler kommer ärvas av alla subklasser, de som "extends" vår superklass, vilket är Plantor.
    private double höjdMeter;
    private String name;

    private double vätskebehov;

    //getter för Vätskebehov, den är inkapslad och man måste anropa getVätskebehov för att få värdet
    public double getVätskebehov() {

        return vätskebehov;
    }

    //setter för Vätskebehov som är inkapslad, måste anropa den för att sätta värdet på Vätskebehov
    public void setVätskebehov(double vätskebehov) {
        this.vätskebehov = vätskebehov;
    }

    //har getters men inga setters för Höjdmeter och getNamn, pga det behövs inte i detta program för inget ändrar namn eller höjd efter uppskapande!
    //getter är till för andra klasser ska få ur värdena ur inkapslade (private) höjdmeter och name, genom anrop
    public double getHöjdMeter() {
        return höjdMeter;
    }

    public String getName() {
        return name;
    }

    public Plantor(double höjdMeter, String name) {        //konstruktor, sätter höjdmeter och name vid uppskapande av ny plantor
        this.höjdMeter = höjdMeter;
        this.name = name;
    }
}




/* Egna reflektioner / onödiga anteckningar
funderade på att ha PrintVätska i superklassen plantor istället för alla subklasser, pga de är ganska liknande kod. Men slutade med att jag hade kvar dem i subklassena!
minns inte exakt men det var något som gjorde att jag tyckte det inte var värt, antingen beroende det på att jag behövde få tillgång till deras vattensort med en "getvatten" metod.
 */
