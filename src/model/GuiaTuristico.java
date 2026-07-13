package model;

/**
 * Representa a un guía turístico de la agencia Llanquihue Tour.
 * Implementa la interfaz Registrable para ser gestionado
 * desde una colección común.
 */
public class GuiaTuristico implements Registrable {

    private String nombre;
    private String especialidad;
    private String telefono;

    public GuiaTuristico(String nombre, String especialidad, String telefono) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) this.nombre = nombre;
    }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) {
        if (especialidad != null && !especialidad.isBlank()) this.especialidad = especialidad;
    }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) {
        if (telefono != null && !telefono.isBlank()) this.telefono = telefono;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("[Guía Turístico] Nombre: " + nombre
                + " | Especialidad: " + especialidad
                + " | Teléfono: " + telefono);
    }

    @Override
    public String toString() {
        return "Guía: " + nombre + " | Especialidad: " + especialidad + " | Tel: " + telefono;
    }
}
