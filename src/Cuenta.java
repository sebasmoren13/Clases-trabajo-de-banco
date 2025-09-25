import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cuenta {

    Scanner teclado = new Scanner(System.in);
    //ATRIBIUTOS CLASES

    private int numero;
    private int cedula;
    private double saldo;

    // CONSTRUCTOR VACIO


    public Cuenta() {
    }

    //CONSTRUCTORES CON TODOS LOS PARAMETROS

    public Cuenta(int numero, int cedula, double saldo) {
        this.numero = numero;
        this.cedula = cedula;
        this.saldo = saldo;
    }

    //GETTER AND SETTER

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    //METODO TOSTRING


    @Override
    public String toString() {
        return "Cuenta{" +
                "numero=" + numero +
                ", cedula=" + cedula +
                ", saldo=" + saldo +
                '}';
    }





    //La opcion numero 4
    // INGRESAR DINERO
    public double ingresarDinero() {
        System.out.println("Digite la cantidad de dinero a ingresar:");
        double monto = teclado.nextDouble();
        if (monto > 0) {
            saldo += monto;
            System.out.println("Ingreso exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Error: monto inválido.");
        }
        return saldo;
    }

    // RETIRAR DINERO
    public double retirarDinero() {
        if (saldo < 10000) {
            System.out.println("No puede retirar: saldo menor a 10,000.");
            return saldo;
        }

        System.out.println("Digite la cantidad de dinero que desea retirar:");
        double retiro = teclado.nextDouble();

        if (retiro > 0 && retiro <= saldo) {
            saldo -= retiro;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("No se puede realizar el retiro. Monto inválido.");
        }
        return saldo;
    }

    // EXTRACCIÓN RÁPIDA (20%)
    public double extraccionRapida() {
        if (saldo < 10000) {
            System.out.println("No puede retirar: saldo menor a 10,000.");
            return saldo;
        }

        double retiro = saldo * 0.20;
        saldo -= retiro;
        System.out.println("Extracción rápida realizada. Retiró el 20% (" + retiro + ")");
        System.out.println("Saldo actual: " + saldo);
        return saldo;
    }

    // FIN
    public static void fin() {
        System.out.println("Gracias por validar tu cuenta :) ");
    }


}

