package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Ingrese el valor de la nota entre 1 y 100:");
    int nota = s.nextInt();

    if (nota > 100 || nota < 0) {
      System.out.println("Valor ingresado no válido");
    } else if (nota > 93) {
      System.out.println("Excelente");
    } else if (nota > 85) {
      System.out.println("Sobresaliente");
    } else if (nota > 75) {
      System.out.println("Distinguido");
    } else if (nota > 60) {
      System.out.println("Bueno");
    } else {
      System.out.println("Desaprobado");
    }

    s.close();
  }
}
