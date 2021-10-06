package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int nro;
    int continuar;

    do {
      System.out.println("Ingrese un número entero");
      nro = s.nextInt();
      System.out.println("El número ingresado es: " + nro);

      System.out.println("Desea repetir la operación?\n1 -> SI\n2 -> NO");
      continuar = s.nextInt();

    } while (continuar == 1);

    System.out.println("Saliendo del programa...");

    s.close();
  }
}
