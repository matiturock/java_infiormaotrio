package revision1;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {

    // realizar una función que calcule el factorial de un núnmero
    Scanner s = new Scanner(System.in);

    System.out.println("Ingrese un número entero:");
    int num = Integer.parseInt(s.nextLine());

    System.out.println(String.format("El factorial de %d es %d", num, calcularFactorial(num)));

    s.close();
  }

  private static int calcularFactorial(int num) {
    if (num <= 1)
      return num;
    return num * calcularFactorial(num - 1);
  }
}
