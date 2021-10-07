package revision1;

public class Empleado {
  private String nombre;
  private int edad;
  private boolean estaEnServicio;

  public Empleado(String nombre, int edad, boolean estaEnServicio) {
    this.nombre = nombre;
    this.edad = edad;
    this.estaEnServicio = estaEnServicio;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public boolean isEstaEnServicio() {
    return estaEnServicio;
  }

  public void setEstaEnServicio(boolean estaEnServicio) {
    this.estaEnServicio = estaEnServicio;
  }

  @Override
  public String toString() {
    return String.format("%s,%d,%b", nombre, edad, estaEnServicio);
  }

}
