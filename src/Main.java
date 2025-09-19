import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    // MENU
    public static void menu() {
        Scanner sc = new Scanner(System.in);

        // Creamos una cuenta de ejemplo (puedes pedir al usuario los datos)
        Cuenta cuenta = new Cuenta(12345, 100200300, 50000);

        int op;
        do {
            System.out.println("\nEscribir la acción que deseas hacer:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Extracción rápida (20% del saldo)");
            System.out.println("5. Cerrar");
            System.out.print("Opción: ");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Saldo actual: " + cuenta.getSaldo());
                    break;
                case 2:
                    cuenta.ingresarDinero();
                    break;
                case 3:
                    cuenta.retirarDinero();
                    break;
                case 4:
                    cuenta.extraccionRapida();
                    break;
                case 5:
                    Cuenta.fin();
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (op != 5);

    }
}
