package model;

import java.util.Objects;

public class Partido {

    private Equipo local;

    private Equipo visitante;

    private int golesLocal;

    private int golesVisitante;

    public Partido(Equipo local, Equipo visitante, int golesAFavor, int golesEnContra) {
        this.local = local;
        this.visitante = visitante;
        this.golesLocal = golesAFavor;
        this.golesVisitante = golesEnContra;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Partido partido = (Partido) o;

        if (!Objects.equals(local, partido.local)) return false;
        return Objects.equals(visitante, partido.visitante);
    }

    @Override
    public int hashCode() {
        int result = local != null ? local.hashCode() : 0;
        result = 31 * result + (visitante != null ? visitante.hashCode() : 0);
        return result;
    }
}
