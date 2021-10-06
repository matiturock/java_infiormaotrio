package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int nro1, nro2, nro3;

    System.out.println("Ingrese por teclado 3 valores numéricos enteros:");

    nro1 = s.nextInt();
    nro2 = s.nextInt();
    nro3 = s.nextInt();

    System.out.println("El primer número ingresado es: " + nro1);
    System.out.println("El sgundo número ingresado es: " + nro2);
    System.out.println("El tercer número ingresado es: " + nro3);

    s.close();
  }
}
