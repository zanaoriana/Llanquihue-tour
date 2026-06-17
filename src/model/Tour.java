package model;

public class Tour {

    private String nombre;
    private String tipo;
    private int precio;
    private int cupos;
    private Guia guia;   // ← composición

    public Tour(String nombre, String tipo, int precio, int cupos,
                String nombreGuia, String especialidad, String telefonoGuia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.cupos = cupos;
        this.guia = new Guia(nombreGuia, especialidad, telefonoGuia); // ← se crea aquí
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) this.nombre = nombre;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) {
        if (tipo != null && !tipo.isBlank()) this.tipo = tipo;
    }

    public int getPrecio() { return precio; }
    public void setPrecio(int precio) {
        if (precio > 0) this.precio = precio;
    }

    public int getCupos() { return cupos; }
    public void setCupos(int cupos) {
        if (cupos >= 0) this.cupos = cupos;
    }

    public Guia getGuia() { return guia; }
    public void setGuia(Guia guia) { this.guia = guia; }

    @Override
    public String toString() {
        return "Tour: " + nombre + " | Tipo: " + tipo
                + " | Precio: $" + precio + " | Cupos: " + cupos
                + "\n   -> " + guia.toString();
    }
}