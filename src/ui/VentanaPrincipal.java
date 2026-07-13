package ui;

import data.GestorEntidades;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * Interfaz gráfica básica del sistema Llanquihue Tour.
 * Permite ingresar y visualizar entidades usando JOptionPane.
 */
public class VentanaPrincipal {

    private GestorEntidades gestor;

    public VentanaPrincipal() {
        gestor = new GestorEntidades();
    }

    /**
     * Inicia el menú principal de la aplicación.
     */
    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            String[] opciones = {
                    "Agregar Guía Turístico",
                    "Agregar Vehículo",
                    "Agregar Colaborador Externo",
                    "Ver todas las entidades",
                    "Salir"
            };

            int opcion = JOptionPane.showOptionDialog(
                    null,
                    "Sistema Llanquihue Tour\n¿Qué deseas hacer?",
                    "Menú Principal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch (opcion) {
                case 0 -> agregarGuia();
                case 1 -> agregarVehiculo();
                case 2 -> agregarColaborador();
                case 3 -> mostrarEntidades();
                case 4, -1 -> continuar = false;
            }
        }

        JOptionPane.showMessageDialog(null, "Sistema cerrado. ¡Hasta pronto!");
    }

    private void agregarGuia() {
        String nombre = JOptionPane.showInputDialog("Nombre del guía:");
        if (nombre == null || nombre.isBlank()) return;

        String especialidad = JOptionPane.showInputDialog("Especialidad:");
        if (especialidad == null || especialidad.isBlank()) return;

        String telefono = JOptionPane.showInputDialog("Teléfono:");
        if (telefono == null || telefono.isBlank()) return;

        gestor.agregar(new GuiaTuristico(nombre, especialidad, telefono));
        JOptionPane.showMessageDialog(null, "✅ Guía turístico agregado correctamente.");
    }

    private void agregarVehiculo() {
        String patente = JOptionPane.showInputDialog("Patente del vehículo:");
        if (patente == null || patente.isBlank()) return;

        String tipo = JOptionPane.showInputDialog("Tipo de vehículo (ej: Bus, Van):");
        if (tipo == null || tipo.isBlank()) return;

        String capacidadStr = JOptionPane.showInputDialog("Capacidad de pasajeros:");
        if (capacidadStr == null || capacidadStr.isBlank()) return;

        try {
            int capacidad = Integer.parseInt(capacidadStr);
            gestor.agregar(new Vehiculo(patente, tipo, capacidad));
            JOptionPane.showMessageDialog(null, "✅ Vehículo agregado correctamente.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "❌ La capacidad debe ser un número.");
        }
    }

    private void agregarColaborador() {
        String nombre = JOptionPane.showInputDialog("Nombre del colaborador:");
        if (nombre == null || nombre.isBlank()) return;

        String empresa = JOptionPane.showInputDialog("Empresa:");
        if (empresa == null || empresa.isBlank()) return;

        String servicio = JOptionPane.showInputDialog("Servicio que presta:");
        if (servicio == null || servicio.isBlank()) return;

        gestor.agregar(new ColaboradorExterno(nombre, empresa, servicio));
        JOptionPane.showMessageDialog(null, "✅ Colaborador externo agregado correctamente.");
    }

    private void mostrarEntidades() {
        ArrayList<Registrable> lista = gestor.obtenerEntidades();

        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay entidades registradas aún.");
            return;
        }

        StringBuilder sb = new StringBuilder("=== Entidades Registradas ===\n\n");

        for (Registrable r : lista) {
            sb.append(r.toString());
            if (r instanceof GuiaTuristico) {
                sb.append(" [Guía Turístico]");
            } else if (r instanceof Vehiculo) {
                sb.append(" [Vehículo]");
            } else if (r instanceof ColaboradorExterno) {
                sb.append(" [Colaborador Externo]");
            }
            sb.append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}