package ui;

import data.GestorServicios;
import model.ServicioTuristico;

import java.util.List;

/**
 * Clase principal del sistema LlanquihueTourApp - Semana 7.
 */
public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        // Mostrar todos los servicios usando polimorfismo
        gestor.mostrarTodos();

        // Validar getters del primer y último servicio (feedback del profesor)
        System.out.println("\n=== Validación de getters ===\n");
        List<ServicioTuristico> lista = gestor.obtenerServicios();

        ServicioTuristico primero = lista.get(0);
        System.out.println("Nombre primer servicio: " + primero.getNombre());
        System.out.println("Duración primer servicio: " + primero.getDuracionHoras() + " horas");

        ServicioTuristico ultimo = lista.get(lista.size() - 1);
        System.out.println("Nombre último servicio: " + ultimo.getNombre());
        System.out.println("Duración último servicio: " + ultimo.getDuracionHoras() + " horas");
    }
}