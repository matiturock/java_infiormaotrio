package level1;

import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Complete los siguientes campos:");

    System.out.println("Ingrese nombre y apellido:");
    String nombreYApellido = s.nextLine();

    System.out.println("Ingrese la edad:");
    int edad = Integer.parseInt(s.nextLine());

    System.out.println("Ingerse la dirección:");
    String direccion = s.nextLine();

    System.out.println("Ingrese la ciudad:");
    String ciudad = s.nextLine();

    Persona per1 = new Persona(nombreYApellido, edad, direccion, ciudad);

    System.out.println(String.format("%s - %s - %d - %s", per1.getCiudad(), per1.getDireccion(), per1.getEdad(),
        per1.getNombreYApellido()));

    s.close();
  }
}
