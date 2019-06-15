package org.lasencinas.item.cereales.subtipos;


import org.lasencinas.item.cereales.Cereales;
import org.lasencinas.packing.Packing;
import org.lasencinas.packing.objetos.Caja;

public class Smiggles extends Cereales {

    /* ---- PROPERTIES ---- */
    private Packing caja = new Caja("Smiggles");
    private float precio = 50;

    /* ---- CONSTRUCTOR ---- */
    public Smiggles(){

    }


    /* ---- MAIN BEHAVIOURS ---- */
    @Override
    public String nombre() {
        return caja.envoltorio();
    }

    @Override
    public Packing empaquetado() {
        return caja;
    }

    @Override
    public Float pvp() {
        return precio;
    }
}
