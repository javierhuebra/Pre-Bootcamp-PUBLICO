package OOP_Advanced.calculadorauno;

/*"implements java.io.Serializable": Indica que la clase "Calculadora" implementa la interfaz "java.io.Serializable". 
Una interfaz en Java es una colección de métodos abstractos que una clase puede implementar. 
La interfaz "Serializable" es una interfaz marcadora en Java que indica que los objetos de esta clase se pueden serializar, 
lo que significa que se pueden convertir en una secuencia de bytes para almacenarlos o transmitirlos, 
y luego se pueden reconstruir a partir de esos bytes. */
public class Calculadora implements java.io.Serializable {
    private double numberA = 0.0;
    private double numberB = 0.0;
    private char operator = '\0';

    public Calculadora() {
        numberA = 0;
        numberB = 0;
    }

    public void setOperandOne(double numberA) {
        this.numberA = numberA;
    }

    public void setOperandTwo(double numberB) {
        this.numberB = numberB;
    }

    public void setOperation(char operator) {
        if (operator == '+' || operator == '-') {
            this.operator = operator;
        } else {
            System.out.println("Operador no válido");
        }
    }

    public double getResult() {
        if (operator == '+') {
            return this.numberA + this.numberB;
        } else if (operator == '-') {
            return this.numberA - this.numberB;
        }else{
            System.out.println("Operador erróneo");
            return Double.NaN;//Retorna is Not a Number
        }
    }

}
