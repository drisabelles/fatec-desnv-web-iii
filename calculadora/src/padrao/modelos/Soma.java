package padrao.modelos;

public class Soma implements Calculo {

  @Override
  public double calcular(double[] valores) {
    double soma = 0;
    for (int i = 0; i < valores.length; i++) {
      soma = soma + valores[i];
    }

    System.out.println("Soma: " + soma);

    return soma;
  }

}