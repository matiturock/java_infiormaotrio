package level1;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    System.out.println("Ingrese un número entero positivo:");

    Scanner s = new Scanner(System.in);
    int nro = s.nextInt();
    s.close();

    mostrarPiramide(nro);
  }

  private static void mostrarPiramide(int nro) {
    String str = "";

    for (int i = 1; i <= nro; i++) {
      str += i;
      System.out.println(str);
    }

  }
}
