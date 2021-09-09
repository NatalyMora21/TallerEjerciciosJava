package Controllers;

public class Ejercicios {

    public static void numeroMayor(){

        double num1 = 5;
        double num2 = 6;
        if (num1 > num2){
            System.out.println("El número mayor es : " + num1);
        }
        else if (num1 < num2 ){
            System.out.println("El número mayor es : " + num2);
        }
        else {
            System.out.println("Los números son iguales");
        }
    }
    public static void numeroMayorp(double num1 , double num2){
        if (num1 > num2){
            System.out.println("El número mayor es : " + num1);
        }
        else if (num1 < num2 ){
            System.out.println("El número mayor es : " + num2);
        }
        else {
            System.out.println("Los números son iguales");
        }
    }

    public static double calcularAreaCirculo(double radio) {

        return Math.PI * Math.pow(radio,2);

    }

    public static double calcularIva (double precio) {
         final int iva = 20;
         return ( iva * precio /100 );
    }

}
