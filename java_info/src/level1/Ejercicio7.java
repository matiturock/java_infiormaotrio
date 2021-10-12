package level1;

import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Ingersa un string en minúsculas:");
    String textoMin = s.nextLine();

    String textoMayus = "";
    for (int i = 0; i < textoMin.length(); i++) {
      textoMayus += charMinuculaAMayuscula(textoMin.charAt(i));
    }

    System.out.println("Texto en mayúsulas: " + textoMayus);

    s.close();
  }

  private static char charMinuculaAMayuscula(char letra) {
    // se pregunta si la letra está en el rango de las minúsculas
    // si es así, se le resta el rango que hay entre 'a' y 'A'
    // es decir: esntre minúsculas y mayúsculas
    if (letra >= 'a' || letra <= 'z')
      letra = (char) (letra - ('a' - 'A'));

    return letra;
  }

}
