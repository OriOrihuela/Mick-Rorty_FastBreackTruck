package org.lasencinas.item.bebida.subtipos;

import org.lasencinas.item.bebida.Bebida;
import org.lasencinas.packing.Packing;
import org.lasencinas.packing.objetos.Tubo;

public class TurbulentJuice extends Bebida {

    /* ---- PROPERTIES ---- */
    private Packing tubo = new Tubo("TurbulentJuice");
    private float precio = 30;

    /* ---- CONSTRUCTORS ---- */
    public TurbulentJuice(){

    }


    /* ---- MAIN BEHAVIOURS ----- */
    @Override
    public String nombre() {
        return tubo.envoltorio();
    }

    @Override
    public Packing empaquetado() {
        return tubo;
    }

    @Override
    public Float pvp() {
        return precio;
    }
}
