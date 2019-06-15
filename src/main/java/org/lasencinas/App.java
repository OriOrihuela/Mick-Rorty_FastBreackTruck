package org.lasencinas;

import org.lasencinas.desayuno.Desayuno;
import org.lasencinas.fastBreakTruck.FastBreakTruck;

public class App {
    public static void main(String[] args) {
        /**
         * Desayuno Eyeholes
         */

        Desayuno eyeDes = FastBreakTruck.prepararEyeHoles();
        System.out.print("\nNo abras la caja de Eyeholes!");
        System.out.println();
        eyeDes.mostrarItems();
        System.out.print("Precio pedido: " + eyeDes.getCoste());

        /**
         * Desayuno Smiggles
         */

        Desayuno smigDes = FastBreakTruck.prepararSmiggles();
        System.out.print("\nSmiggles per als nins!");
        System.out.println();
        smigDes.mostrarItems();
        System.out.print("Precio pedido: " + smigDes.getCoste());

        /**
         * Plumbus
         */

        eyeDes = FastBreakTruck.prepararEyeHoles();
        FastBreakTruck.incluirJuguete(eyeDes);
        System.out.print("\nEyeholes con toy!");
        System.out.println();
        eyeDes.mostrarItems();
        System.out.print("Precio pedido: " + eyeDes.getCoste());
    }
}
