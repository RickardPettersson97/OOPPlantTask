import javax.swing.*;

public class Kaktus extends Plantor {



    private final int kaktusVätskaCl = 2;           //final för den ändras aldrig, gjorde specifik variabel för kaktus

    protected PlantEnum vatten = PlantEnum.MINERALVATTEN;


    public Kaktus (double höjdMeter, String namn) {               //konstruktor
       super(höjdMeter, namn);
    }


    @Override
    public void CalculateVätska() {            //används icke, men pga jag implementera i superklass måste den vara med
    }

    @Override
    public void PrintVätska() {
        JOptionPane.showMessageDialog(null, this.getName() + " behöver " + this.kaktusVätskaCl + " cl " + this.vatten.vattenTyp + " per dag");
    }
}
