package level1;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    System.out.println("Ingresa un número entero:");

    Scanner s = new Scanner(System.in);
    int nro = s.nextInt();
    s.close();

    int resultado = calcularFactorial(nro);
    System.out.println(String.format("El facotrial de %d es: %d", nro, resultado));
  }

  private static int calcularFactorial(int nro) {
    int limite = nro;

    for (int i = 1; i <= limite; i++) {
      nro = nro * i;
    }

    return nro;
  }
}
