/**
 * Se dispone de una colección de Empleados, de cada empleado se conoce:
 * - Nombre y Apellido
 * - DNI
 * - horasTrabajadas
 * - valorPorHora
 */

package level2;

class Empleado {
  private String nombreYApellido;
  private int dni;
  private int horasTrabajadas;
  private int valorPorHora;

  public Empleado(String nombreYApellido, int dni, int horasTrabajadas, int valorPorHora) {
    this.nombreYApellido = nombreYApellido;
    this.dni = dni;
    this.horasTrabajadas = horasTrabajadas;
    this.valorPorHora = valorPorHora;
  }

  public String getNombreYApellido() {
    return nombreYApellido;
  }

  public void setNombreYApellido(String nombreYApellido) {
    this.nombreYApellido = nombreYApellido;
  }

  public int getDni() {
    return dni;
  }

  public void setDni(int dni) {
    this.dni = dni;
  }

  public int getHorasTrabajadas() {
    return horasTrabajadas;
  }

  public void setHorasTrabajadas(int horasTrabajadas) {
    this.horasTrabajadas = horasTrabajadas;
  }

  public int getValorPorHora() {
    return valorPorHora;
  }

  public void setValorPorHora(int valorPorHora) {
    this.valorPorHora = valorPorHora;
  }

  @Override
  public String toString() {
    return "Empleado [dni=" + dni + ", horasTrabajadas=" + horasTrabajadas + ", nombreYApellido=" + nombreYApellido
        + ", valorPorHora=" + valorPorHora + "]";
  }

}
