package padrao.io;

import java.util.Scanner;

public class Entrada {
  private Scanner leitor;

  public Entrada() {
    leitor = new Scanner(System.in);
  }

  public double receberNumeroDouble() {
    double numero = leitor.nextDouble();

    return numero;
  }

  public double[] receberDoisNumeros() {
    double numero1 = leitor.nextDouble();
    double numero2 = leitor.nextDouble();
    double[] numeros = { numero1, numero2 };

    return numeros;
  }

  public int receberNumeroInteiro() {
    int numero = leitor.nextInt();

    return numero;
  }

  public String receberTexto() {
    String texto = leitor.nextLine();

    return texto;
  }

  @Override
  protected void finalize() throws Throwable {
    leitor.close();
  }
}