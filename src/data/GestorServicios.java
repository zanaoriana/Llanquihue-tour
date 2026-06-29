package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;
import java.util.ArrayList;

/**
 * Clase gestora que crea instancias de prueba de los servicios turísticos.
 */
public class GestorServicios {

    public ArrayList<ServicioTuristico> obtenerServicios() {

        ArrayList<ServicioTuristico> servicios = new ArrayList<>();

        // Dos RutaGastronomica
        servicios.add(new RutaGastronomica("Ruta del Salmón Austral", 4, 5));
        servicios.add(new RutaGastronomica("Ruta Cervecera Puerto Varas", 3, 4));

        // Dos PaseoLacustre
        servicios.add(new PaseoLacustre("Paseo Lago Llanquihue", 2, "Catamarán"));
        servicios.add(new PaseoLacustre("Cruce Andino", 6, "Lancha a motor"));

        // Dos ExcursionCultural
        servicios.add(new ExcursionCultural("Iglesias de Chiloé", 5, "Iglesia de Dalcahue"));
        servicios.add(new ExcursionCultural("Frutillar Histórico", 3, "Teatro del Lago"));

        return servicios;
    }
}