package padrao.modelos;

public class Subtracao implements Calculo {
  @Override
  public double calcular(double[] valores) {
    double subtracao = 0;

    for (int i = 0; i < valores.length; i++) {
      subtracao = subtracao - valores[i];
    }

    System.out.println("Subtracao = " + subtracao);

    return subtracao;
  }
}