package model;

/**
 * Representa un vehículo utilizado por la agencia Llanquihue Tour.
 * Implementa la interfaz Registrable para ser gestionado
 * desde una colección común.
 */
public class Vehiculo implements Registrable {

    private String patente;
    private String tipo;
    private int capacidad;

    public Vehiculo(String patente, String tipo, int capacidad) {
        this.patente = patente;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public String getPatente() { return patente; }
    public void setPatente(String patente) {
        if (patente != null && !patente.isBlank()) this.patente = patente;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) {
        if (tipo != null && !tipo.isBlank()) this.tipo = tipo;
    }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) {
        if (capacidad > 0) this.capacidad = capacidad;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("[Vehículo] Patente: " + patente
                + " | Tipo: " + tipo
                + " | Capacidad: " + capacidad + " pasajeros");
    }

    @Override
    public String toString() {
        return "Vehículo: " + patente + " | Tipo: " + tipo + " | Capacidad: " + capacidad;
    }
}