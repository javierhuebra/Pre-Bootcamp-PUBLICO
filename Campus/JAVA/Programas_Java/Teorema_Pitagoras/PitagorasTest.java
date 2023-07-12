public class PitagorasTest {
  public static void main(String[] args) {
    Pitagoras pitagoras = new Pitagoras();
    double c1 = 5.0;
    double c2 = 3.0;
    double hipotenusa = pitagoras.calcularHipotenusa(c1, c2);
    System.out.println("El valor de la hipotenusa es: " + hipotenusa);
  }
}