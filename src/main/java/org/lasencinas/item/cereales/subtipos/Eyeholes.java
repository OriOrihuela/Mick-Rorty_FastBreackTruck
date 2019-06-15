package org.lasencinas.item.cereales.subtipos;

import org.lasencinas.item.cereales.Cereales;
import org.lasencinas.packing.Packing;
import org.lasencinas.packing.objetos.Caja;

public class Eyeholes extends Cereales {

    /* ---- PROPERTIES ---- */
    private Packing caja = new Caja("Eyeholes");
    private float precio = 25;

    /* ---- CONSTRUCTOR ---- */
    public Eyeholes() {

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
