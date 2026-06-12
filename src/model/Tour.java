package model;

public class Tour {

    private String nombre;
    private String tipo;
    private int precio;
    private int cupos;

    public Tour(String nombre, String tipo, int precio, int cupos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.cupos = cupos;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getPrecio() { return precio; }
    public void setPrecio(int precio) { this.precio = precio; }

    public int getCupos() { return cupos; }
    public void setCupos(int cupos) { this.cupos = cupos; }

    @Override
    public String toString() {
        return "Tour: " + nombre + " | Tipo: " + tipo
                + " | Precio: $" + precio + " | Cupos: " + cupos;
    }
}
