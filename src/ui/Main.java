package ui;

import data.GestorServicios;
import model.ServicioTuristico;
import java.util.ArrayList;

/**
 * Clase principal del sistema LlanquihueTourApp - Semana 6.
 */
public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();
        ArrayList<ServicioTuristico> servicios = gestor.obtenerServicios();

        System.out.println("=== Servicios Turísticos - Llanquihue Tour ===\n");

        for (ServicioTuristico s : servicios) {
            System.out.println(s.toString());
        }
    }
}