package com.upchiapas.proyecto02.modelos;

public class Participante {
    private String nombre;
    private String lugar;
    private int folio;

    public Participante(String nombre, String lugar, int folio) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.folio = folio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public int getFolio() {
        return folio;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nombre='" + nombre + '\'' +
                ", folio=" + folio +
                ", lugar='" + lugar + '\'' +
                '}';
    }

}
