/**
 * Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
 * Ayuda: ArrayList posee un método para particionar en sub-listas?
 */

package level2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
  public static void main(String[] args) {
    List<String> alumnos = new ArrayList<>();

    cargarListaAlumnos(alumnos);
    System.out.println("Alumnos total:");
    mostrarListaAlumnos(alumnos);

    List<String> alumnosGrupo1 = alumnos.subList(0, 4);
    System.out.println("Alumnos Grupo 1:");
    mostrarListaAlumnos(alumnosGrupo1);

    List<String> alumnosGrupo2 = alumnos.subList(4, 8);
    System.out.println("Alumnos Grupo 2:");
    mostrarListaAlumnos(alumnosGrupo2);

    List<String> alumnosGrupo3 = alumnos.subList(8, 12);
    System.out.println("Alumnos Grupo 3:");
    mostrarListaAlumnos(alumnosGrupo3);
  }

  private static void mostrarListaAlumnos(List<String> alumnos) {
    for (String alumno : alumnos) {
      System.out.println("->" + alumno);
    }
  }

  private static void cargarListaAlumnos(List<String> alumnos) {
    alumnos.add("Alumno 1");
    alumnos.add("Alumno 2");
    alumnos.add("Alumno 3");
    alumnos.add("Alumno 4");
    alumnos.add("Alumno 5");
    alumnos.add("Alumno 6");
    alumnos.add("Alumno 7");
    alumnos.add("Alumno 8");
    alumnos.add("Alumno 9");
    alumnos.add("Alumno 10");
    alumnos.add("Alumno 11");
    alumnos.add("Alumno 12");
  }
}
