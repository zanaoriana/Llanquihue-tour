package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase gestora que administra la colección polimórfica
 * de servicios turísticos de Llanquihue Tour.
 */
public class GestorServicios {

    private List<ServicioTuristico> servicios;

    public GestorServicios() {
        servicios = new ArrayList<>();

        // Al menos 5 objetos combinando las 3 subclases
        servicios.add(new RutaGastronomica("Ruta del Salmón Austral", 4, 5));
        servicios.add(new RutaGastronomica("Ruta Cervecera Puerto Varas", 3, 4));
        servicios.add(new PaseoLacustre("Paseo Lago Llanquihue", 2, "Catamarán"));
        servicios.add(new PaseoLacustre("Cruce Andino", 6, "Lancha a motor"));
        servicios.add(new ExcursionCultural("Iglesias de Chiloé", 5, "Iglesia de Dalcahue"));
        servicios.add(new ExcursionCultural("Frutillar Histórico", 3, "Teatro del Lago"));
    }

    /**
     * Retorna la colección completa de servicios turísticos.
     * @return lista de servicios.
     */
    public List<ServicioTuristico> obtenerServicios() {
        return servicios;
    }

    /**
     * Recorre la colección e invoca mostrarInformacion()
     * de forma polimórfica desde la referencia ServicioTuristico.
     */
    public void mostrarTodos() {
        System.out.println("=== Servicios Turísticos - Llanquihue Tour ===\n");
        for (ServicioTuristico s : servicios) {
            s.mostrarInformacion();
        }
    }
}