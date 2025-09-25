import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    // MENU
    public static void menu() {
        Scanner menu = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        List<Cuenta>lstLista=new ArrayList<>();


        int op;

do{
    Cuenta c1= new Cuenta();

        System.out.println("1. Crear cuenta");
        System.out.println("2. Mostrar cuenta");
        System.out.println("3. Eliminar cuenta ");
        System.out.println("4. Buscar cuenta");

        op = menu.nextInt();

        switch (op) {

            case 1:
                System.out.println("1. Crear cuenta");

                System.out.println("Digitar numero de cuenta");
                c1.setNumero(teclado.nextInt());
                System.out.println("Digitar numero de cedula");
                c1.setCedula(teclado.nextInt());
                System.out.println("Digitar saldo");
                c1.setSaldo(teclado.nextDouble());

                lstLista.add(c1);




                break;
            case 2:

                System.out.println("2. Mostrar cuenta");


                for(Cuenta c: lstLista){

                    System.out.println(c);
                }

                break;
            case 3:
               Scanner eliminar_cuenta=new Scanner(System.in);
                int eliminar ;
                System.out.println("3. Eliminar cuenta por el numero");
                eliminar=eliminar_cuenta.nextInt();
                for (Cuenta c:lstLista){
                    if (lstLista.isEmpty()){
                        System.out.println("No exite ninguna cuenta");
                    }
                    else if (c.getNumero()==(eliminar)){
                        lstLista.remove(c);
                        System.out.println("la cuenta fue elimninada");
                    }

                }

                break;
            case 4:

                System.out.println("4. Buscar cuenta");

                menu2();

                break;

            default:
                System.out.println("Opción inválida.");

        }
        }
        while (op != 4) ;

    }


        public static void menu2() {
            Scanner menu2 = new Scanner(System.in);
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

                op = menu2.nextInt();

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

