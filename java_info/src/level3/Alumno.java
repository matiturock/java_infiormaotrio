package level3;

import java.time.LocalDate;

public class Alumno {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public Alumno(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return LocalDate.now().getYear() - this.fechaNacimiento.getYear();
    }

    @Override
    public String toString() {
        return String.format("Apellido y Nombre: %s, %s - Fecha nacimiento: %s", this.apellido, this.nombre,
                this.fechaNacimiento);
    }

}
