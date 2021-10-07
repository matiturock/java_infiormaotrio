package revision1;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Ingrese dos números enteros por teclado:");
    int num1 = s.nextInt();
    int num2 = s.nextInt();

    System.out.println("La suma de los dos números es: " + (num1 + num2));

    s.close();
  }
}
