package org.lasencinas.desayuno;

import org.lasencinas.item.Item;
import org.lasencinas.item.toy.Toy;
import org.lasencinas.noEyeholesException.NoEyeholesException;

import java.util.ArrayList;
import java.util.List;

public class Desayuno {

    /* ---- PROPERTIES ---- */
    private List<Item> items = new ArrayList<>();
    private float totalPrice = 0;


    /* ---- CONSTRUCTORS ---- */
    public Desayuno() {
    }


    /* ---- GETTERS ---- */
    public List<Item> getItems() {
        return items;
    }

    /* ---- MAIN BEHAVIOURS ---- */
    public void addCerealOrDrink(Item item) {
        getItems().add(item);
    }

    public void addToy(Toy toy) throws NoEyeholesException {
        boolean eyeholesInBreakfast = false;
        for (Item item :
                getItems()) {
            if (item.empaquetado().envoltorio().equals("Eyeholes")) {
                eyeholesInBreakfast = true;
            }
        }
        if (eyeholesInBreakfast) {
            getItems().add(toy);
        }
        else {
            throw new NoEyeholesException();
        }
    }

    public void mostrarItems() {
        for (Item item :
                getItems()) {
            System.out.println(item);
        }
    }

    public Float getCoste() {
        for (Item item :
                getItems()) {
            this.totalPrice += item.pvp();

        }
        return this.totalPrice;
    }
}
