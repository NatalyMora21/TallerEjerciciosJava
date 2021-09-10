package Controllers;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Ejercicios {

    public static void numeroMayor(){
        System.out.println("--- Opción 1. Función que compara dos números ---");
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

    public static String eliminarEspacios(String frase) {

        return frase.replace(" ","");
    }

    public static void longitudFrase(String frase) {

        int longitudFrase = frase.length();
        int canta=0;
        int cante=0;
        int canti=0;
        int canto=0;
        int cantu=0;

        String fraseSinEspacios = frase.replace(" ", "");

        for (int i = 0; i < fraseSinEspacios.length(); i++) {
            if ( fraseSinEspacios.charAt(i) == 'a') {
                canta+=1;
            }
            else if ( fraseSinEspacios.charAt(i) == 'e') {
                cante+=1;
            }
            else if ( fraseSinEspacios.charAt(i) == 'i') {
                canti+=1;
            }
            else if (fraseSinEspacios.charAt(i) == 'o' ) {
                canto+=1;
            }
            else if (fraseSinEspacios.charAt(i) == 'u' ) {
                cantu+=1;
            }
        }

        System.out.println( "Longitud de la frase: " + longitudFrase);
        System.out.println( "Cantidad de vocales en una frase");
        System.out.println( "Cantidad de vocales en a: " + canta );
        System.out.println( "Cantidad de vocales en e: " + cante );
        System.out.println( "Cantidad de vocales en i: " + canti );
        System.out.println( "Cantidad de vocales en o: " + canto );
        System.out.println( "Cantidad de vocales en u: " + cantu );
    }

    public static boolean compararPalabras (String palabra1, String palabra2) {
        if (palabra1==palabra2) {
            return true;
        }
        else {
            return false;
        }
    }

    public static DateTimeFormatter consultarFecha () {

        DateTimeFormatter fechaActual = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        return  fechaActual;
    }

    public static void numerosdosendos(int numero) {
        List<Integer> numeros;
        for (int i = numero; i < 1000; i+=2) {
            System.out.println(i);
        }
    }

    public static void opcionesMenu(Scanner sc) {

        System.out.println("****** GESTION CINEMATOGRÁFICA ********");
        System.out.println("1-NUEVO ACTOR");
        System.out.println("2-BUSCAR ACTOR");
        System.out.println("3-ELIMINAR ACTOR");
        System.out.println("4-MODIFICAR ACTOR");
        System.out.println("5-VER TODOS LOS ACTORES");
        System.out.println("6- VER PELICULAS DE LOS ACTORES");
        System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
        System.out.println("8-SALIR");

        int opcion;

        do{
            System.out.println("Ingrese una opción del Menú");
            opcion = Integer.parseInt(sc.next());

            switch (opcion){
                case 1:
                    System.out.println("1-NUEVO ACTOR");

                case 2:
                    System.out.println("2-BUSCAR ACTOR");

                case 3:
                    System.out.println("3-ELIMINAR ACTOR");

                case 4:
                    System.out.println("4-MODIFICAR ACTOR");

                case 5:
                    System.out.println("5-VER TODOS LOS ACTORES");

                case 6:
                    System.out.println("6- VER PELICULAS DE LOS ACTORES");

                case 7:
                    System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");

                case 8:
                    System.out.println("8-SALIR");

                default:
                    System.out.println("OPCIÓN INCORRECTA INGRESE UN NÚMERO NUEVO");
            }
        }
        while (opcion!=8);

    }





}
