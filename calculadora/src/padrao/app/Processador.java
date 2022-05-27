package padrao.app;

import padrao.io.Entrada;
import padrao.modelos.Calculo;

public class Processador {
  public double processar(Calculo calculo, Entrada entrada) {
    double[] numeros = entrada.receberDoisNumeros();
    double resultado = calculo.calcular(numeros);

    return resultado;
  }
}
