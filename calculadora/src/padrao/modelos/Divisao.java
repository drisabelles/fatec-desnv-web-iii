package padrao.modelos;

public class Divisao implements Calculo {

  @Override
  public double calcular(double[] valores) {
    double divisao = valores[0];
    for (int i = 1; i < valores.length; i++) {
      divisao = divisao / valores[i];
    }

    System.out.println("Divisao = " + divisao);

    return divisao;
  }

}
