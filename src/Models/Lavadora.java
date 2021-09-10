package Models;

public class Lavadora extends Electrodomesticos {

    private double carga;

    public Lavadora(String precio, double base, String color, char consumo, double peso, double carga){
        super(precio,base, color,consumo,peso);
        this.carga =carga;
    }
    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public int precioFinal() {

        int precioFinal;
        if(this.carga > 30){
            precioFinal = super.precioFinal()+50;
        }
        else {
            precioFinal = super.precioFinal();
        }
        return precioFinal;
    }
}
