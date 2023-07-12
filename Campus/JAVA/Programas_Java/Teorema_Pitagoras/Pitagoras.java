import java.lang.Math;

public class Pitagoras {
  public double calcularHipotenusa(double c1, double c2){
    double hipotenusa = Math.sqrt((c1*c1) + (c2*c2));
    return hipotenusa;
  }
}