package level1;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Ingrese su nombre:");
    String nombre = s.nextLine();

    System.out.println(String.format("Hola %s", nombre));

    s.close();
  }
}
