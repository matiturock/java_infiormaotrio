package level1;

import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Ingresa dos números enteros:");
    int num1 = s.nextInt();
    int num2 = s.nextInt();

    int acum = num1;
    for (int i = 1; i < num2; i++) {
      acum *= num1;
    }

    System.out.println(String.format("%d elevado a la %d es: %d", num1, num2, acum));

    s.close();
  }
}
