package ui;

import data.GestorEntidades;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Vehiculo;

/**
 * Clase principal del sistema LlanquihueTourApp - Semana 8.
 * Lanza la interfaz gráfica y demuestra el uso de instanceof por consola.
 */
public class Main {

    public static void main(String[] args) {

        // Demostración por consola con instanceof
        GestorEntidades gestor = new GestorEntidades();

        gestor.agregar(new GuiaTuristico("Marcela Pinto", "Gastronómica", "+56911112222"));
        gestor.agregar(new Vehiculo("ABCD12", "Bus", 40));
        gestor.agregar(new ColaboradorExterno("Pedro Soto", "TransAustral", "Transporte"));
        gestor.agregar(new GuiaTuristico("Camila Reyes", "Lacustre", "+56933334444"));
        gestor.agregar(new Vehiculo("WXYZ99", "Van", 12));

        gestor.mostrarTodas();

        // Lanzar la interfaz gráfica
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.iniciar();
    }
}