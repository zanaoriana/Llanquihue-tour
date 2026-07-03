package model;

public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() { return lugarHistorico; }
    public void setLugarHistorico(String l) {
        if (l != null && !l.isBlank()) this.lugarHistorico = l;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Excursión Cultural: " + getNombre()
                + " | Duración: " + getDuracionHoras() + " horas"
                + " | Lugar histórico: " + lugarHistorico);
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Tipo: Excursión Cultural | Lugar histórico: " + lugarHistorico;
    }
}