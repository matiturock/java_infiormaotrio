package ejercicios;

import java.util.Scanner;

public class Ejercicio7_3 {
  public static void main(String[] args) {
    int nota;
    nota = notaValida();
    mostrarCategoriaNota(nota);
  }

  private static void mostrarCategoriaNota(int nota) {
    if (nota > 93) {
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
  }

  private static int notaValida() {
    Scanner s = new Scanner(System.in);
    int nota;

    do {
      System.out.println("Ingresa una nota enetre 1 y 100");
      nota = s.nextInt();
    } while (nota < 0 || nota > 100);

    s.close();
    return nota;
  }
}
