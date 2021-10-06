package ejercicios;

import java.util.Scanner;

public class Ejercicio7_2 {

  private static String saludo = "Bienvenido. Ingrese 3 números enteros";

  public static void main(String[] args) {
    System.out.println(saludo);
    int[] nros = new int[3];

    ingersarNumeros(nros);
    leerNumeros(nros);
  }

  private static void leerNumeros(int[] nros) {
    for (int i = 0; i < nros.length; i++) {
      System.out.println("El " + i + "º número ingresado es: " + nros[i]);
    }
  }

  private static void ingersarNumeros(int[] nros) {
    Scanner s = new Scanner(System.in);

    for (int i = 0; i < nros.length; i++) {
      nros[i] = s.nextInt();
    }

    s.close();
  }
}
