package org.lasencinas.packing.objetos;

import org.lasencinas.packing.Packing;

public class Tubo implements Packing {

    /* ---- PROPERTIES ---- */
    private String envoltorio = null;


    /* ---- CONSTRUCTOR ---- */
    public Tubo(String envoltorio) {
        this.envoltorio = envoltorio;
    }


    /* ---- MAIN BEHAVIOURS ---- */
    @Override
    public String envoltorio() {
        return envoltorio;
    }

    @Override
    public String toString() {
        return "tubo";
    }
}
