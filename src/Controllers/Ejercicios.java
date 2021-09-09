package Controllers;

import java.util.ArrayList;
import java.util.List;

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

    public static List<List> calcularnumImparesParesWhile () {

        List<Integer> pares = new ArrayList<Integer>();
        List<Integer> impares = new ArrayList<Integer>();
        List<List> pareseimpares = new ArrayList<List>();

        int cant = 0;

        while (cant <= 100) {
            if ( cant % 2 == 0 ) {
                pares.add(cant);
            }
            else {
                impares.add(cant);
            }
            cant += 1;
        }

        pareseimpares.add(pares);
        pareseimpares.add(impares);

        return pareseimpares;
    }

    public static List<List> calcularnumImparesParesFor () {

        List<Integer> pares = new ArrayList();
        List<Integer> impares = new ArrayList();
        List<List> pareseimpares = new ArrayList();

        int cant = 0;

        for (int i = 0; i <= 100; i++) {
            if ( i % 2 == 0 ) {
                pares.add(i);
            }
            else {
                impares.add(i);
            }
        }

        pareseimpares.add(pares);
        pareseimpares.add(impares);

        return pareseimpares;
    }

    public static boolean esNumeropositivo (double num) {

        boolean espositvo = num >= 0 ?  true : false;
        return espositvo;
    }

    public static void esDiaLabora( String dia) {

        boolean laboral;

        switch (dia){
            case "lunes":
                System.out.println("Día laboral");
                break;
            case "martes":
                System.out.println("Día laboral");
                break;
            case "miercoles":
                System.out.println("Día laboral");
                break;
            case "jueves":
                System.out.println("Día laboral");
                break;
            case "viernes":
                System.out.println("Día laboral");
                break;
            case "sabado":
                System.out.println("Día no laboral");
                break;
            case "domingo":
                System.out.println("Día no laboral");
                break;

            default:
                System.out.println("Día no encontrado");
                laboral = false;

        }

    }

    public static String reemplazarletra(String frase) {

        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        String textoreplace = texto.replace("a","e");

        return textoreplace + " " + frase;
    }
}
