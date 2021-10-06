package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Ingrese un número del día de la semana, entre 1 y 7");
    int diaSemana = s.nextInt();

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

    s.close();
  }
}
