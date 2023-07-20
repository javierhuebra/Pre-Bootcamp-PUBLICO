package OOP_Advanced.calculadorauno;

import java.util.Scanner;

public class CalculadoraTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // CALCULADORA 1 ------------------------------------------------------------
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

        System.out.println("El resultado de " + numberA + " " + operator + " " + numberB + " es " + cuenta.getResult());

        System.out.println();

        // ---------------------------------------------------------------------------

        // CALCULADORA 2 -------------------------------------------------------------
        // Este codigo no respeta la separacion en terminos, lo continuaré mas adelante
        /*
         * CalculadoraDos calculadora = new CalculadoraDos();
         * calculadora.performOperation(5.0);
         * calculadora.performOperation('+');
         * calculadora.performOperation(3.0);
         * calculadora.performOperation('*');
         * calculadora.performOperation(2.0);
         * calculadora.performOperation('-');
         * calculadora.performOperation(10.0);
         * calculadora.performOperation('/');
         * calculadora.performOperation(2.0);
         * calculadora.result();
         */

    }

}
