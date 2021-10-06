package level1;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Ingrese el valor de 2 números enteros:");
    int nro1 = s.nextInt();
    int nro2 = s.nextInt();
    s.close();

    System.out.println(String.format("%d + %d = %d", nro1, nro2, (nro1 + nro2)));
    System.out.println(String.format("%d - %d = %d", nro1, nro2, (nro1 - nro2)));
    System.out.println(String.format("%d * %d = %d", nro1, nro2, (nro1 * nro2)));
    System.out.println(String.format("%d / %d = %.2f", nro1, nro2, (float) (nro1 / nro2)));
    System.out.println(String.format("%d + %d = %d", nro1, nro2, (nro1 % nro2)));
  }
}
