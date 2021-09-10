package App;
import java.util.List;
import java.util.Scanner;
import Controllers.Ejercicios;
import Controllers.Menu;


public class AppEjercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menú principal");
        System.out.println();
        System.out.println("1. Calcular número mayor");
        System.out.println("2. Calcular número mayor por consola");
        System.out.println("3. Calcular area de un circulo");
        System.out.println("4. Calcular precio de un producto + IVA");
        System.out.println("5. Mostar número pares e impares");
        System.out.println("6. Mostar número pares e impares -Ciclo For");
        System.out.println("7. Validar que un número sea mayor o igual a cero");
        System.out.println("8. Validar día laboral");
        System.out.println("9. Reemplazar letras 'a' y concatenación de un texto dado");
        System.out.println("10. Eliminar espacios de una frase");
        System.out.println("11. Calcular la longitud y vocales de una frase  ");
        System.out.println("12. Comparar palabras");
        System.out.println("13. Hora actual");
        System.out.println("14. Mostar número de dos en dos hasta 100");
        System.out.println("15. Calcular número mayor");
        System.out.println("16. Calcular número mayor");
        System.out.println("17. Calcular número mayor");
        System.out.println("18. Calcular número mayor");

        String opcionMenu= sc.next();
        menuOption (Integer.parseInt(opcionMenu));
    }

    private static void menuOption(int option){

        Scanner sc = new Scanner(System.in);

        switch (option) {
            case 1:
                Ejercicios.numeroMayor();
            case 2:
                Menu.numeroMayor(sc);
            case 3:
                Menu.calcularAreaCirculo(sc);
            case 4:
                Menu.calcularIva(sc);
            case 5:
                List<List> listado = Ejercicios.calcularnumImparesParesWhile();
                Menu.calcularnumImparesPares(sc,listado);
            case 6:
                List<List> listadon = Ejercicios.calcularnumImparesParesFor();
                Menu.calcularnumImparesPares(sc,listadon);
            case 7:
                Menu.validarNumeroPositivo(sc);
            case 8:
                Menu.esDiaLaboral(sc);
            case 14:
                Menu.numerosdosendos(sc);
            case 15:
                Ejercicios.opcionesMenu(sc);
            case 16:
                Menu.crearPersona(sc);
        }

    }
}
