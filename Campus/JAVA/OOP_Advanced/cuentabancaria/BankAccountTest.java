package OOP_Advanced.cuentabancaria;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount cuentaA = new BankAccount();
        BankAccount cuentaB = new BankAccount();

        
        cuentaA.getSaldoCorriente();
        cuentaA.getSaldoAhorro();

        cuentaA.setSaldoCCA(250);
        cuentaB.setSaldoCCA(250);

        cuentaA.getSaldoCorriente();
        cuentaA.getSaldoAhorro();

        //cuentaA.retirarDineroCCA(350);
        
        cuentaA.getSaldoCorriente();
        cuentaA.getSaldoAhorro();

        System.out.println("\n------Dinero total en cuentas-----");

        BankAccount.mostrarDineroTotal();

    }
}
