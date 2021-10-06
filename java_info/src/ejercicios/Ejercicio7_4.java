package ejercicios;

import java.util.Scanner;

public class Ejercicio7_4 {
  public static void main(String[] args) {
    int diaSemana = ingresarDiaSemana();
    mostrarNombreDiaSemana(diaSemana);
  }

  private static void mostrarNombreDiaSemana(int diaSemana) {
    switch (diaSemana) {
      case 1:
        System.out.println("Lunes");
        break;
      case 2:
        System.out.println("Martes");
        break;
      case 3:
        System.out.println("Miércoles");
        break;
      case 4:
        System.out.println("Jueves");
        break;
      case 5:
        System.out.println("Viernes");
        break;
      case 6:
        System.out.println("Sábado");
        break;
      case 7:
        System.out.println("Domingo");
        break;

      default:
        System.out.println("Valor ingresado no válido");
        break;
    }
  }

  private static int ingresarDiaSemana() {
    Scanner s = new Scanner(System.in);
    int diaSemana;

    do {
      System.out.println("Ingresa el número del día de la semana, del 1 a 7:");
      diaSemana = s.nextInt();
    } while (diaSemana < 1 || diaSemana > 7);

    s.close();
    return diaSemana;
  }
}
