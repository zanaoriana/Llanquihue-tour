package app;

import model.Tour;
import service.GestorTours;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        GestorTours gestor = new GestorTours();
        ArrayList<Tour> tours = gestor.cargarTours("resources/tours.txt");

        System.out.println("=== Catálogo completo de Tours ===\n");
        for (Tour t : tours) {
            System.out.println(t.toString());
        }

        System.out.println("\n=== Tours Gastronómicos ===\n");
        for (Tour t : tours) {
            if (t.getTipo().equals("gastronómico")) {
                System.out.println(t.toString());
            }
        }

        System.out.println("\n=== Tours con precio menor a $40.000 ===\n");
        for (Tour t : tours) {
            if (t.getPrecio() < 40000) {
                System.out.println(t.toString());
            }
        }

        System.out.println("\n=== Búsqueda: 'Volcán' ===\n");
        Tour encontrado = gestor.buscarPorNombre(tours, "Volcán");
        if (encontrado != null) {
            System.out.println(encontrado.toString());
        } else {
            System.out.println("No se encontró ningún tour con ese nombre.");
        }
    }
}