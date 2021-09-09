package Controllers;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Menu {

    public static void numeroMayor(Scanner sc) {
        System.out.println("Ingrese el primer número");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número");
        double num2 = sc.nextDouble();
        Ejercicios.numeroMayorp(num1, num2);
    }

    public static void calcularAreaCirculo(Scanner sc) {
        System.out.println("Ingrese el radio del circulo");
        String radio = sc.next();
        double newradio = Double.parseDouble (radio);
        double area = Ejercicios.calcularAreaCirculo(newradio);
        System.out.println("El área del circulo es: " + area);
    }

    public static void calcularIva(Scanner sc) {
        System.out.println("Ingrese el precio del producto");
        String radio = sc.next();
        double precio = Double.parseDouble (radio);
        double preciototal = Ejercicios.calcularAreaCirculo(precio);
        System.out.println("El precio total del producto más el IVA es: " + preciototal);
    }

    public static void calcularnumImparesPares(Scanner sc, List<List> listado ) {
        List<Integer> numerospares = listado.get(0);
        List<Integer> numerosimpares = listado.get(1);

        System.out.println("--Número pares--");
        for (Integer numero:numerospares) {
            System.out.println(numero);
        }
        System.out.println("--Número impares--");
        for (Integer numero:numerosimpares) {
            System.out.println(numero);
        }
    }

    public static void validarNumeroPositivo (Scanner sc) {
        boolean espositivo;
        do {
            System.out.println("Ingrese un número positivo");
            double numerodouble = Double.parseDouble ( sc.next() );
            espositivo = Ejercicios.esNumeropositivo(numerodouble);
        } while (!espositivo);
    }

    public static void esDiaLaboral(Scanner sc) {
        System.out.println("Ingrese un día de la semana");
        String diaSemana = sc.next();
        Ejercicios.esDiaLabora(diaSemana.toLowerCase());
    }

    public static void reemplazarletra(Scanner sc) {
        System.out.println("Ingrese una frase");
        String frase = sc.next();
        Ejercicios.reemplazarletra(frase);
    }

    public static void eliminarespacio(Scanner sc) {
        System.out.println("Ingrese una frase");
        String frase = sc.next();
        String fraseAjustada = Ejercicios.eliminarEspacios(frase);
        System.out.println("Frase sin espacios: "+fraseAjustada);
    }

    public static void longitudFrase(Scanner sc) {
        System.out.println("Ingrese una frase");
        String frase = sc.next();
        Ejercicios.longitudFrase(frase);
    }

    public static void compararPalabras (Scanner sc) {
        System.out.println("Ingrese la primera palabra");
        String palabra1 = sc.next();
        System.out.println("Ingrese la segunda palabra");
        String palabra2 = sc.next();
        boolean resultado = Ejercicios.compararPalabras(palabra1,palabra2 );

        if (resultado){
            System.out.println("La palabras son iguales");
        }
        else {
            System.out.println("La palabras son diferentes");
        }
    }

    public static void consultarFecha (Scanner sc) {
        Date fechaActual = Ejercicios.consultarFecha();
        System.out.println("La fecha actual es " + fechaActual);

    }

    public static void numerosdosendos (Scanner sc) {
        Date fechaActual = Ejercicios.consultarFecha();
        System.out.println("Ingrese un número");
        int num = Integer.parseInt(sc.next()); ;

        Ejercicios.numerosdosendos(num);




    }


}