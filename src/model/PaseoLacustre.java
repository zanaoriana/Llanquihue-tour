package model;

public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() { return tipoEmbarcacion; }
    public void setTipoEmbarcacion(String t) {
        if (t != null && !t.isBlank()) this.tipoEmbarcacion = t;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Paseo Lacustre: " + getNombre()
                + " | Duración: " + getDuracionHoras() + " horas"
                + " | Embarcación: " + tipoEmbarcacion);
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Tipo: Paseo Lacustre | Embarcación: " + tipoEmbarcacion;
    }
}