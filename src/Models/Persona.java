package Models;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public String getDNI() {
        return DNI;
    }

    public Persona() {
        this.nombre= "";
        this.edad = 0;
        this.sexo = ' ';
        this.DNI = "";
        this.peso= 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad,char sexo){
        this.nombre= nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = "";
        this.peso= 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura, String DNI ) {
        this.nombre= nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso= peso;
        this.altura = altura;
    }

    public int calcularMC(){
        double calPesoIdeal = this.peso/(Math.pow(this.altura,2));
        int pesoIdeal = 0;
        if (calPesoIdeal < 20) {
            pesoIdeal = -1;
        }
        else if(calPesoIdeal >= 20 && calPesoIdeal <=25){
            pesoIdeal = 0;
        }
        else if (calPesoIdeal>25){
            pesoIdeal = 1;
        }
        return pesoIdeal;
    }

    public boolean esMayorDeEdad(){
        boolean esMayor = this.edad > 18 ? true : false;
        return  esMayor;

    }

    private void comprobarSexo() {
        if (this.sexo != 'F' || this.sexo != 'M'){
            this.sexo= 'M';
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString(){

        return ("H");
    }

    /*private String  generarDNI(){

    }*/

}
