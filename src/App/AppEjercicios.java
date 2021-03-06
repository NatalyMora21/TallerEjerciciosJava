package App;
import java.util.List;
import java.util.Scanner;
import Controllers.Ejercicios;
import Controllers.Menu;


public class AppEjercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcionMenu;

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
        System.out.println("15. Generar Menú");
        System.out.println("16. Clase Personas");
        System.out.println("17. Clase Electrodomesticos");
        System.out.println("18. Clase Serie");
        System.out.println("00. Para terminar marque 0");

        do{
            System.out.println("Seleccione una opción del menú, para salir, marque 0");
            opcionMenu= Integer.parseInt( sc.next());
            menuOption (opcionMenu);

        }
        while (opcionMenu !=0);
    }

    private static void menuOption(int option){

        Scanner sc = new Scanner(System.in);

        switch (option) {
            case 1:
                Ejercicios.numeroMayor();
                break;
            case 2:
                Menu.numeroMayor(sc);
                break;
            case 3:
                Menu.calcularAreaCirculo(sc);
                break;
            case 4:
                Menu.calcularIva(sc);
                break;
            case 5:
                System.out.println("--- Opción 5. Calcular pares e impares- ciclo While ---");
                List<List> listado = Ejercicios.calcularnumImparesParesWhile();
                Menu.calcularnumImparesPares(sc,listado);
                break;
            case 6:
                System.out.println("--- Opción 6. Calcular pares e impares- ciclo for ---");
                List<List> listadon = Ejercicios.calcularnumImparesParesFor();
                Menu.calcularnumImparesPares(sc,listadon);
                break;
            case 7:
                Menu.validarNumeroPositivo(sc);
                break;
            case 8:
                Menu.esDiaLaboral(sc);
                break;
            case 9:
                Menu.reemplazarletra(sc);
                break;
            case 10:
                Menu.eliminarespacio(sc);
                break;
            case 11:
                Menu.longitudFrase(sc);
                break;
            case 12:
                Menu.compararPalabras(sc);
                break;
            case 13:
                Menu.consultarFecha(sc);
                break;
            case 14:
                Menu.numerosdosendos(sc);
                break;
            case 15:
                Ejercicios.opcionesMenu(sc);
                break;
            case 16:
                Menu.crearPersona(sc);
                break;
            case 17:
                Menu.crearPersona(sc);
                break;
            case 18:
                Menu.crearPersona(sc);
                break;
        }

    }
}
