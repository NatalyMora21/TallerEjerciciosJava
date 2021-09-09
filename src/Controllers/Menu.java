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
}