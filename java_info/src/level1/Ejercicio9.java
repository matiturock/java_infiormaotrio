package level1;

import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Ingresa un texto:");
    String texto = s.nextLine();

    System.out.println("Ingresa un caracter:");
    char letra = s.next().charAt(0);

    int contador = 0;
    for (int i = 0; i < texto.length(); i++) {
      if (letra == texto.charAt(i)) {
        contador++;
      }
    }

    if (contador == 0) {
      System.out.println(String.format("En el texto '%s',no aparece el caracter '%c'", texto, letra));
    } else {
      System.out.println(String.format("En el texto '%s', el caracter '%c' aprece %d %s.", texto, letra, contador,
          (contador > 1) ? "veces" : "vez"));
    }

    s.close();
  }
}
