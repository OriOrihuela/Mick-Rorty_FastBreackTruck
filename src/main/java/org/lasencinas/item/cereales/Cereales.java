package org.lasencinas.item.cereales;

import org.lasencinas.item.Item;

public abstract class Cereales implements Item {

    /* ---- MAIN BEHAVIOURS ---- */
    @Override
    public String toString() {
        return "Item: " + nombre() +
                ", Empaquetado: " + empaquetado() +
                ", Precio: " + pvp();
    }
}
