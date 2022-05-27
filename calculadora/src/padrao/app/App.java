package padrao.app;

import padrao.io.Entrada;
import padrao.modelos.Soma;

public class App {
  public static void main(String[] args) {
    System.out.println("Bem-vindo a calculadora estratégica!");

    boolean execucao = true;

    Entrada entrada = new Entrada();
    Processador processador = new Processador();

    while (execucao) {
      System.out.println("Por favor, escolha a operação que seja realizar: ");
      System.out.println("1 - soma");
      System.out.println("2 - subtração");
      System.out.println("3 - multiplicação");
      System.out.println("4 - divisão");
      System.out.println("5 - hipotenusa");
      System.out.println("0 - sair");

      int opcao = entrada.receberNumeroInteiro();

      switch (opcao) {
        case 1: {
          double resultado = processador.processar(new Soma(), entrada);
          System.out.println("Resultado: " + resultado);
          break;
        }
        default:
          System.out.println("Operação não entendida: (");
      }
    }
  }

}
