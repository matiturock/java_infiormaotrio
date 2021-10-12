package level1;

public class Persona {
  private String nombreYApellido;
  private int edad;
  private String direccion;
  private String ciudad;

  public Persona(String nombreYApellido, int edad, String direccion, String ciudad) {
    this.nombreYApellido = nombreYApellido;
    this.edad = edad;
    this.direccion = direccion;
    this.ciudad = ciudad;
  }

  public String getNombreYApellido() {
    return nombreYApellido;
  }

  public void setNombreYApellido(String nombreYApellido) {
    this.nombreYApellido = nombreYApellido;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

}
