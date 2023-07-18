package OOP_Advanced.cuentabancaria;

import java.util.Random;
import java.util.Scanner;

public class BankAccount {
    private String nroCuenta;
    private double saldoCorriente;
    private double saldoAhorro;

    private static int cuentasCreadas;
    private static double dineroTotalEnCuentas;

    public BankAccount() {
        nroCuenta = crearNroDeCuenta();

        cuentasCreadas++;
    }

    private String crearNroDeCuenta() {
        Random nroRandom = new Random();

        StringBuilder string = new StringBuilder();

        int i = 0;

        while (i < 10) {
            int digito = nroRandom.nextInt(10);

            string.append(digito);

            i++;
        }

        return string.toString();
    }

    public double getSaldoCorriente() {
        System.out.printf("Saldo CC: %.2f", saldoCorriente);
        System.out.println();
        return saldoCorriente;
    }

    public double getSaldoAhorro() {
        System.out.printf("Saldo CA: %.2f", saldoAhorro);
        System.out.println();
        return saldoAhorro;
    }

    public void setSaldoCCA(double ingreso) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingrese dinero en cc o ca : ");
        String destino = scanner.nextLine();

        if (destino.equals("cc")) {
            saldoCorriente += ingreso;
        } else if (destino.equals("ca")) {
            saldoAhorro += ingreso;
        } else {
            System.out.println("Comando no valido");
            return;
        }

        dineroTotalEnCuentas += ingreso;
    }

    public double retirarDineroCCA(double egreso) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Retira de cc o ca : ");

        String destino = scanner.nextLine();

        if (destino.equals("cc") && egreso<saldoCorriente) {
            saldoCorriente -= egreso;
            dineroTotalEnCuentas -= egreso;
            return saldoCorriente;
        } else if (destino.equals("ca") && egreso<saldoAhorro) {
            saldoAhorro -= egreso;
            dineroTotalEnCuentas -= egreso;
            return saldoAhorro;
        } else {
            System.out.println("Comando no valido o fondos insuficientes");
            return -1;
        }
    }

    public static void mostrarDineroTotal(){
        System.out.println("Total de dinero almacenado por el banco: "+dineroTotalEnCuentas);
        
    }

}
