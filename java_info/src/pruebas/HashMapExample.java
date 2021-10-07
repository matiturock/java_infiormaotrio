package pruebas;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
  public static void main(String[] args) {

    // inicializar map (colección que asocia clves únicas con valores)
    Map<Integer, String> dnis = new HashMap<>();
    Map<String, String> personajeShow = new HashMap<>();

    // inserción
    dnis.put(123, "Homero");
    dnis.put(456, "Bart");
    dnis.put(789, "Lisa");

    personajeShow.put("Homero", "Los Simpsons");
    personajeShow.put("Goku", "Dragon Ball");
    personajeShow.put("Link", "Legend of Zelda");
    personajeShow.put("Link", "Legend of Zelda 2"); // clave repetida

    System.out.println("Size de dnis: " + dnis.size());
    System.out.println("Size de personajeShow: " + personajeShow.size());
    // preguntamos si los dos maps tienen el mismo tamaño
    System.out.println(dnis.size() == personajeShow.size()); // -> true
    // es decir que si ingresamos una clave repetida, pisa la vieja

    // accceso
    System.out.println(dnis.get(123));
    System.out.println(personajeShow.keySet());
    System.out.println(personajeShow.values());
  }
}
