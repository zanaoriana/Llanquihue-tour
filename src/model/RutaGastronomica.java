package model;

public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() { return numeroDeParadas; }
    public void setNumeroDeParadas(int n) {
        if (n > 0) this.numeroDeParadas = n;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Ruta Gastronómica: " + getNombre()
                + " | Duración: " + getDuracionHoras() + " horas"
                + " | Paradas: " + numeroDeParadas);
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Tipo: Ruta Gastronómica | Paradas: " + numeroDeParadas;
    }
}