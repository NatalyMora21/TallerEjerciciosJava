package Controllers;
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

}