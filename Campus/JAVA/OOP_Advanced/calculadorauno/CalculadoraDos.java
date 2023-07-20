package OOP_Advanced.calculadorauno;

import java.util.ArrayList;

public class CalculadoraDos implements java.io.Serializable {
    private ArrayList<Object> arrEcuacion = new ArrayList<Object>();

    public void performOperation(Object numOrChar) {
        arrEcuacion.add(numOrChar);
    }
    public void result() {
        double resultado = 0;
        char operador = '+';

        for (Object valor : arrEcuacion) {
            if (valor instanceof Double) {
                double numero = (double) valor;

                // Realiza la operación según el operador actual
                switch (operador) {
                    case '+':
                        resultado += numero;
                        break;
                    case '-':
                        resultado -= numero;
                        break;
                    case '*':
                        resultado *= numero;
                        break;
                    case '/':
                        if (numero != 0) {
                            resultado /= numero;
                        } else {
                            System.out.println("Error: División por cero.");
                            return;
                        }
                        break;
                    default:
                        System.out.println("Error: Operador inválido.");
                        return;
                }
            } else if (valor instanceof Character) {
                char nuevoOperador = (char) valor;
                if (nuevoOperador == '+' || nuevoOperador == '-' || nuevoOperador == '*' || nuevoOperador == '/') {
                    operador = nuevoOperador;
                } else {
                    System.out.println("Error: Operador inválido.");
                    return;
                }
            }
        }

        System.out.println("Resultado: " + resultado);
    }

    
}