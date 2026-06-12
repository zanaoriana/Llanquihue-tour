package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> tours = gestor.cargarTours("resources/tours.txt");

        // Recorrido: mostrar todos los tours
        System.out.println("=== Catálogo completo de Tours ===\n");
        for (Tour t : tours) {
            System.out.println(t.toString());
        }

        // Filtro 1: tours gastronómicos
        System.out.println("\n=== Tours Gastronómicos ===\n");
        for (Tour t : tours) {
            if (t.getTipo().equals("gastronómico")) {
                System.out.println(t.toString());
            }
        }

        // Filtro 2: tours con precio menor a $40.000
        System.out.println("\n=== Tours con precio menor a $40.000 ===\n");
        for (Tour t : tours) {
            if (t.getPrecio() < 40000) {
                System.out.println(t.toString());
            }
        }
    }
}