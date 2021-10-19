/**
 * Escriba en JAVA un ejemplo de Polimorfismo y Sobrecarga de métodos y funciones.
 */

package pruebas;

public class PolimorfismoYSobrecarga {
  public static void main(String[] args) {
    // prueba polimorfismo,mismo nombre pero cambia el comportamiento
    metodoPolimorfismo();
    InnerPolimorfismoYSobrecarga.metodoPolimorfismo();

    // prueba sobrecarga
    System.out.println(metodoConSobrecarga(2, 4));
    System.out.println(metodoConSobrecarga(2, 4, 6));
  }

  public static int metodoConSobrecarga(int a, int b) {
    return a + b;
  }

  public static int metodoConSobrecarga(int a, int b, int c) {
    return a + b + c;
  }

  public static void metodoPolimorfismo() {
    System.out.println("Comportamiento 1");
  }
}

/**
 * InnerPolimorfismoYSobrecarga
 */
class InnerPolimorfismoYSobrecarga extends PolimorfismoYSobrecarga {

  public static void metodoPolimorfismo() {
    System.out.println("Comporrtamiento 2 cambiado");
  }

}
