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
    // TODO cambiar de min a mayus
    int num = Character.getNumericValue(letra);
    letra = (char) (num - 32);

    return letra;
  }

}
