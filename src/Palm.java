import javax.swing.*;

public class Palm extends Plantor{


    protected PlantEnum vatten = PlantEnum.KRANVATTEN;          //vatten variabel sätts / initieras till PlantEnum.Kranvatten, alltså konstanten KRANVATTEN. this.vatten.vattenTyp ger kranvatten i små bokstäver (från strängvariabeln vattentyp i enum)

    //aktuella egenskaperna är höjden och namnet, dessa egenskaper har alla olika sorters plantor! så anropar superkonstruktorn som sätter värde på objekt
    public Palm (double höjdMeter, String namn){
    super(höjdMeter, namn);
    }

    @Override
    public void CalculateVätska() {                         //kalkylerar vätskebehov, har beräkningen som anrop till metoden i Plantor
        this.setVätskebehov(this.getHöjdMeter() * 0.5);
    }

    //utan vattentyp hade det stått KRANVATTEN, den som anropar konstruktorn
    @Override
    public void PrintVätska() {
        JOptionPane.showMessageDialog(null, this.getName() + " behöver " + String.format("%.2f", this.getVätskebehov()) + " liter " + this.vatten.vattenTyp + " per dag");

    }
}




/*
"onödiga" anteckningar / reflektioner
private double vätskebehov;  //hade först variabler i varje subklass innan jag la in den i superklassen

  public void CalculateVätska() {
        this.vätskebehov = this.getHöjdMeter()*0.5;
 */