package model;

/**
 * Representa a un colaborador externo de la agencia Llanquihue Tour.
 * Implementa la interfaz Registrable para ser gestionado
 * desde una colección común.
 */
public class ColaboradorExterno implements Registrable {

    private String nombre;
    private String empresa;
    private String servicio;

    public ColaboradorExterno(String nombre, String empresa, String servicio) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.servicio = servicio;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) this.nombre = nombre;
    }

    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) {
        if (empresa != null && !empresa.isBlank()) this.empresa = empresa;
    }

    public String getServicio() { return servicio; }
    public void setServicio(String servicio) {
        if (servicio != null && !servicio.isBlank()) this.servicio = servicio;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("[Colaborador Externo] Nombre: " + nombre
                + " | Empresa: " + empresa
                + " | Servicio: " + servicio);
    }

    @Override
    public String toString() {
        return "Colaborador: " + nombre + " | Empresa: " + empresa + " | Servicio: " + servicio;
    }
}