package level1;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    System.out.println("Ingresa un número entero:");

    Scanner s = new Scanner(System.in);
    int nro = s.nextInt();
    s.close();

    int resultado = factorialRecursivo(nro);
    System.out.println(String.format("El facotrial de %d con recursividad es: %d", nro, resultado));

    int resiltado2 = factorialCiclo(nro);
    System.out.println(String.format("El factorial de %d con ciclos es: %d", nro, resiltado2));
  }

  private static int factorialRecursivo(int nro) {
    if (nro <= 1)
      return nro;
    return nro * factorialRecursivo(nro - 1);
  }

  private static int factorialCiclo(int nro) {
    int acum = 1;

    for (int i = nro; i >= 1; i--) {
      acum *= i;
    }

    return acum;
  }

}
