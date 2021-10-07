package pruebas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListExample {
  public static void main(String[] args) {

    // inicializar el aaray list
    List<String> nombres = new ArrayList<>();

    nombres.add("Bob");
    nombres.add("Patricio");
    nombres.add("Calamardo");

    System.out.println("Elementos en la lista: " + nombres.size());
    System.out.println("Elemento 1 de la lista: " + nombres.get(1));
    System.out.println("Último elemento de la lista: " + nombres.get(nombres.size() - 1));

    nombres.remove("Patricio");
    System.out.println("Elementos de la lista después de remover: " + nombres.size());

    // ejemplo de set -> hashset
    Set<String> shows = new HashSet<>();

    shows.add("Dragon Ball");
    shows.add("Naruto");
    shows.add("Ranma 1/2");

    for (String nombre : nombres) {
      System.out.println("Nombre: " + nombre);
    }

    for (String show : shows) {
      System.out.println("Show: " + show);
    }
  }
}
