/**
 * Se desea una aplicación que solicite 2 números enteros y realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).
 */

package level1;

import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Ingresa dos números enteros:");
    int num1 = s.nextInt();
    int num2 = s.nextInt();

    int acum = 0;
    for (int i = 0; i < num2; i++) {
      acum += num1;
    }

    System.out.println(String.format("%d x %d = %d", num1, num2, acum));

    s.close();
  }

}
