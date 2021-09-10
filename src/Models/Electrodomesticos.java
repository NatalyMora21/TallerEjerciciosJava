package Models;

import jdk.swing.interop.SwingInterOpUtils;

public class Electrodomesticos {
    private String precio;
    private double base;
    private String color;
    private char consumo;
    private double peso;
    private double tamano;

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public Electrodomesticos(String precio, double base, String color, char consumo, double peso) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.base = base;
        this.consumo = consumo;
    }

    public Electrodomesticos(String precio, double peso) {
        this.precio = precio;
        this.peso = peso;
        this.color = "blanco";
        this.base = 100;
    }

    public Electrodomesticos(){
        this.color = "blanco";
        this.base = 100;
        this.peso = 5;
    }

    public void comprobarConsumoEnergetico (char letra) {

        if (this.consumo != 'A'){
            if (this.consumo != 'B'){
                this.consumo = 'F';
            }
        }

    }

    public void comprobarColor(String color){

    }

    public int precioConsumo(){
        int precioConsumo=0;
        switch (this.consumo){
            case 'A':
                precioConsumo = 100;
                break;
            case 'B':
                precioConsumo = 80;
                break;
            case 'C':
                precioConsumo = 60;
                break;
            case 'D':
                precioConsumo = 50;
                break;
            case 'E':
                precioConsumo= 30;
                break;
            case 'F':
                precioConsumo=100;
                break;
        }
        return precioConsumo;
    }

    public int precioTamaño(){

        int precioTamano = 0;

        if (this.tamano>0 && this.tamano <=19){
            precioTamano = 10;
        }
        else if (this.tamano>=20 && this.tamano <=49 ) {
            precioTamano = 50;
        }
        else if (this.tamano>=50 && this.tamano <=79 ) {
            precioTamano = 80;
        }
        else if (this.tamano >= 80 ) {
            precioTamano = 100;
        }
        return precioTamano;
    }

    public int precioFinal () {
        return precioConsumo() + precioTamaño();
    }

}
