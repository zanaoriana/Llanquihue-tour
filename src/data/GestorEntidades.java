package data;

import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

import java.util.ArrayList;

/**
 * Clase gestora que administra la colección de entidades
 * registrables del sistema Llanquihue Tour.
 */
public class GestorEntidades {

    private ArrayList<Registrable> entidades;

    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

    /**
     * Agrega una entidad a la colección.
     * @param entidad objeto que implementa Registrable.
     */
    public void agregar(Registrable entidad) {
        entidades.add(entidad);
    }

    /**
     * Retorna la colección de entidades.
     * @return lista de entidades registrables.
     */
    public ArrayList<Registrable> obtenerEntidades() {
        return entidades;
    }

    /**
     * Recorre la colección, muestra el resumen de cada entidad
     * y usa instanceof para diferenciar su tipo.
     */
    public void mostrarTodas() {
        System.out.println("=== Entidades Registradas - Llanquihue Tour ===\n");

        for (Registrable r : entidades) {
            r.mostrarResumen();

            if (r instanceof GuiaTuristico) {
                System.out.println("   -> Tipo identificado: Guía Turístico");
            } else if (r instanceof Vehiculo) {
                System.out.println("   -> Tipo identificado: Vehículo");
            } else if (r instanceof ColaboradorExterno) {
                System.out.println("   -> Tipo identificado: Colaborador Externo");
            }
        }
    }
}