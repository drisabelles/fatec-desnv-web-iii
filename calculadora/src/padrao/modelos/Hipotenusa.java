package padrao.modelos;

public class Hipotenusa implements Calculo {
  @Override
  public double calcular(double[] valores) {
    double hipotenusa = Math.sqrt(Math.pow(valores[0], 2) + Math.pow(valores[1], 2));

    System.out.println("Hipotenusa = " + hipotenusa);

    return hipotenusa;
  }
}
