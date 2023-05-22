import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("Selecciona el numero de la opcion deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextInt());

            switch (response) {
                case 1:
                    System.out.println("has elegido movies");
                    break;
                case 2:
                    System.out.println("has elegido series");
                    break;
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                default:
                    System.out.println("valor ingresado incorrecto");
            }

        } while (response != 0);
        System.out.println("fin del programa");
    }
}
