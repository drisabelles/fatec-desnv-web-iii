package padrao.modelos;

public class Multiplicacao implements Calculo {
  @Override
  public double calcular(double[] valores) {
    double multiplicacao = 0;
    for (int i = 0; i < valores.length; i++) {
      multiplicacao = multiplicacao * valores[i];
    }

    System.out.println("Multiplicacao: " + multiplicacao);

    return multiplicacao;
  }
}
