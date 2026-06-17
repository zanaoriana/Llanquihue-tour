package service;

import model.Tour;
import util.DatoInvalidoException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorTours {

    public ArrayList<Tour> cargarTours(String ruta) {
        ArrayList<Tour> lista = new ArrayList<>();

        try {
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
            String linea;
            int numeroLinea = 0;

            while ((linea = lector.readLine()) != null) {
                numeroLinea++;
                try {
                    String[] datos = linea.split(";");

                    if (datos.length != 7) {
                        throw new DatoInvalidoException(
                                "Línea " + numeroLinea + " no tiene el formato correcto.");
                    }

                    String nombre = datos[0];
                    String tipo = datos[1];
                    int precio = Integer.parseInt(datos[2]);
                    int cupos = Integer.parseInt(datos[3]);
                    String nombreGuia = datos[4];
                    String especialidadGuia = datos[5];
                    String telefonoGuia = datos[6];

                    if (precio <= 0) {
                        throw new DatoInvalidoException(
                                "Línea " + numeroLinea + ": el precio debe ser mayor a cero.");
                    }

                    Tour tour = new Tour(nombre, tipo, precio, cupos,
                            nombreGuia, especialidadGuia, telefonoGuia);
                    lista.add(tour);

                } catch (NumberFormatException e) {
                    System.out.println("Error en línea " + numeroLinea
                            + ": precio o cupos no son números válidos.");
                } catch (DatoInvalidoException e) {
                    System.out.println("Dato inválido -> " + e.getMessage());
                }
            }
            lector.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return lista;
    }

    public Tour buscarPorNombre(ArrayList<Tour> lista, String nombre) {
        for (Tour t : lista) {
            if (t.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                return t;
            }
        }
        return null;
    }
}