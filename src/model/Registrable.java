package model;

/**
 * Interfaz que define el contrato de comportamiento común
 * para todas las entidades gestionables del sistema Llanquihue Tour.
 */
public interface Registrable {

    /**
     * Muestra un resumen de la información de la entidad.
     * Cada clase que implemente esta interfaz debe definir
     * su propio comportamiento para este método.
     */
    void mostrarResumen();
}