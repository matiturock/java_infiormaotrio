package ejerciciosenclase;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Ingrese dos números enteros");

    int nro1 = s.nextInt();
    int nro2 = s.nextInt();
    int suma = nro1 + nro2;

    System.out.println("La suma de los dos números es " + suma);

    s.close();
  }
}
