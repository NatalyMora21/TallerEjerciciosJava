package Controllers;
import Models.Persona;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Menu {

    private static java.time.format.DateTimeFormatter DateTimeFormatter;

    public static void numeroMayor(Scanner sc) {
        System.out.println("--- Opción 2. Función que compara dos números ingresados por console e indica el mayor ---");
        System.out.println("Ingrese el primer número");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número");
        double num2 = sc.nextDouble();
        Ejercicios.numeroMayorp(num1, num2);
    }

    public static void calcularAreaCirculo(Scanner sc) {
        System.out.println("--- Opción 3. Función que calcula el área del círculo ---");
        System.out.println("Ingrese el radio del circulo");
        double radio = sc.nextDouble();
        double area = Ejercicios.calcularAreaCirculo(radio);
        System.out.println("El área del circulo es: " + area);
    }

    public static void calcularIva(Scanner sc) {
        System.out.println("--- Opción 4. Calcular IVA ---");
        System.out.println("Ingrese el precio del producto");
        double precio = sc.nextDouble();
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

        System.out.println("--- Opción 7. Validar si un número es positivo ---");

        boolean espositivo;
        do {
            System.out.println("Ingrese el número");
            double numerodouble = Double.parseDouble ( sc.next() );
            espositivo = Ejercicios.esNumeropositivo(numerodouble);
        } while (!espositivo);
    }

    public static void esDiaLaboral(Scanner sc) {
        System.out.println("--- Opción 8. Validar si un dia de la semana es laboral ---");
        System.out.println("Ingrese un día de la semana");
        String diaSemana = sc.next();
        Ejercicios.esDiaLabora(diaSemana.toLowerCase());
    }

    public static void reemplazarletra(Scanner sc) {
        System.out.println("--- Opción 9. Reemplaza letras a por la e y concatena con la frase indicada ---");
        System.out.println("Ingrese una frase");
        String frase = sc.next();
        Ejercicios.reemplazarletra(frase);
    }

    public static void eliminarespacio(Scanner sc) {
        System.out.println("--- Opción 10. Eliminar espacios de una frase ingresada por consola ---");
        String frase = sc.next();
        String fraseAjustada = Ejercicios.eliminarEspacios(frase);
        System.out.println("Frase sin espacios: "+fraseAjustada);
    }

    public static void longitudFrase(Scanner sc) {
        System.out.println("--- Opción 11. Calcular la longitud de una frase y cantidades de vocales ---");
        System.out.println("Ingrese una frase");
        String frase = sc.next();
        Ejercicios.longitudFrase(frase);
    }

    public static void compararPalabras (Scanner sc) {
        System.out.println("--- Opción 12. Comparar dos palabras ---");
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

        System.out.println("--- Opción 13. Consulta de Fecha y hora actual---");
        DateTimeFormatter fechaActual= Ejercicios.consultarFecha();
        System.out.println("La fecha actual es " + fechaActual.format(LocalDateTime.now()));

    }

    public static void numerosdosendos (Scanner sc) {

        System.out.println("--- Opción 14. Apartir de un núermo muestra los números de dos en dos---");
        System.out.println("Ingrese un número");
        int num = Integer.parseInt(sc.next()); ;
        Ejercicios.numerosdosendos(num);
    }

    public static  void crearPersona(Scanner sc) {
        System.out.println("--- Opción 15. ");
        System.out.println("Ingrese su nombre");
        String nombre = sc.next();
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        System.out.println("Ingrese su sexo");
        char sexo = sc.next().charAt(0);
        System.out.println("Ingrese su peso");
        double peso = sc.nextDouble();
        System.out.println("Ingrese su altura");
        double altura = sc.nextDouble();

        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura, "");
        Persona persona2 = new Persona(nombre,edad,sexo);
        Persona persona3 = new Persona();
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);

    }






}