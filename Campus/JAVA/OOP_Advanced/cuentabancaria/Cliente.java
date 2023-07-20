package OOP_Advanced.cuentabancaria;

public class Cliente {
    
    private String nombreCliente;
   private BankAccount cuentaBancaria;
    
   //Constructor
   public Cliente(String nombre, BankAccount numeroCuenta){
    this.nombreCliente = nombre;
    this.cuentaBancaria = numeroCuenta;
   }


   public void  infoClienteBanco(){
    System.out.println(this.nombreCliente +" "+ "tienen un total de ahorros " + 
    this.cuentaBancaria.getSaldoAhorro());
   }




}
