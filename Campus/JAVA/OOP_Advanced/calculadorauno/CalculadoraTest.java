package OOP_Advanced.calculadorauno;

import java.util.Scanner;

public class CalculadoraTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculadora cuenta = new Calculadora();

        double numberA;
        double numberB;

        String operatorString;
        char operator;

        System.out.printf("Ingrese el numero A: ");
        numberA = scanner.nextDouble();

        System.out.printf("Ingrese el operador: ");
        operatorString = scanner.next();

        System.out.printf("Ingrese el numero B: ");
        numberB = scanner.nextDouble();

        operator = operatorString.charAt(0);

        cuenta.setOperandOne(numberA);
        cuenta.setOperation(operator);
        cuenta.setOperandTwo(numberB);

        System.out.println("El resultado de "+numberA+" "+operator+" "+numberB+" es "+ cuenta.getResult());


        System.out.println();

    }

}
