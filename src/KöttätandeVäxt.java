import javax.swing.*;

public class KöttätandeVäxt extends Plantor {


    protected PlantEnum vatten = PlantEnum.PROTEINDRICKA;


    public KöttätandeVäxt(double höjdMeter, String namn){       //konstruktor
      super(höjdMeter,namn);
    }

    @Override
    public void CalculateVätska() {
        this.setVätskebehov(0.1 + 0.2*this.getHöjdMeter());
    }

    @Override
    public void PrintVätska() {
        JOptionPane.showMessageDialog(null, this.getName()+ " behöver " + String.format("%.2f", this.getVätskebehov()) + " liter " + this.vatten.vattenTyp + " per dag");
    }
}




/* onödiga anteckningar / reflektioner
this.getVätskebehov()
//0.1 + 0.2*((double) this.höjdCentiMeter /100); casta this.höjdcentimeter till double, annars fick jag utskrift 0.1, pga höjdcentimeter är int


private double vätskebehov;

  public void CalculateVätska() {
        this.vätskebehov = 0.1 + 0.2*this.getHöjdMeter();
 */