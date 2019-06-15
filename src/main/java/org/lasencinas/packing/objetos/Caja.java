package org.lasencinas.packing.objetos;

import org.lasencinas.packing.Packing;

public class Caja implements Packing {

    /* ---- PROPERTIES ---- */
    private String envoltorio = null;


    /* ---- CONSTRUCTORS ---- */
    public Caja(String envoltorio ) {
        this.envoltorio = envoltorio;
    }


    /* ---- BEHAVIOURS ---- */
    @Override
    public String envoltorio() {
        return envoltorio;
    }

    @Override
    public String toString() {
        return "caja";
    }
}
