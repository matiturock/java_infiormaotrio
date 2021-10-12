package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    List<String> ciudadesFavoritas = new ArrayList<>();

    cargarCiudades(ciudadesFavoritas);

    imprimirCiudades(ciudadesFavoritas);
  }

  private static void imprimirCiudades(List<String> ciudadesFavoritas) {
    System.out.println("Tus ciudades favoritas son:");

    int cont = 1;
    for (String ciudad : ciudadesFavoritas) {
      System.out.println(String.format("#%d - %s", cont, ciudad));
      cont++;
    }
  }

  private static void cargarCiudades(List<String> ciudadesFavoritas) {
    int continuar = 1;
    Scanner s = new Scanner(System.in);

    do {
      System.out.println("Ingresa el nombre de tu ciudad favorita:");
      ciudadesFavoritas.add(s.nextLine());

      System.out.println("Desea agregar otra ciudad? 1-SI 0-NO");
      continuar = Integer.parseInt(s.nextLine());
    } while (continuar == 1);

    s.close();
  }
}
