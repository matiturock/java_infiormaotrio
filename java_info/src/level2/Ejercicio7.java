/**
 * Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final.
 * Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”.
 * Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor debe frenar (no se incluye en el cálculo)
 * Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 
 */

package level2;

import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    System.out.println("FIZZBUZZ");
    System.out.println("Ingrese dos valores enteros.");

    Scanner scan = new Scanner(System.in);

    System.out.println("Ingrese el valor de inicio:");
    Integer inicio = Integer.parseInt(scan.nextLine());

    System.out.println("Ingrese el valor de fin (no se incluye):");
    Integer fin = Integer.parseInt(scan.nextLine());

    fizzBuzzFun(inicio, fin);

    scan.close();
  }

  private static void fizzBuzzFun(Integer inicio, Integer fin) {
    for (int i = inicio; i < fin; i++) {
      String str = String.valueOf(i) + " ";
      if (i % 3 == 0)
        str += "Fizz";
      if (i % 5 == 0)
        str += "Buzz";
      System.out.println(str);
    }
  }
}
