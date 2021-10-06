package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Ingrese un número entero:");
    int nro = s.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(String.format("%d x %d = %d", nro, i, (nro * i)));
    }

    s.close();
  }
}
