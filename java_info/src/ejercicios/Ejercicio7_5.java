package ejercicios;

import java.util.Scanner;

public class Ejercicio7_5 {
  public static void main(String[] args) {
    System.out.println("Ingrese un número entero:");

    Scanner s = new Scanner(System.in);
    int nro = s.nextInt();
    s.close();

    mostrarTabla(nro);
  }

  private static void mostrarTabla(int nro) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(String.format("%d x %d = %d", nro, i, (nro * i)));
    }
  }
}