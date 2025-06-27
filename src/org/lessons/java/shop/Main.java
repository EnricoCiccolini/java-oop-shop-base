package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Prodotto collector = new Prodotto("magic", "magic", new BigDecimal(60), new BigDecimal(0.22));
        // Prodotto milk = new Prodotto("Milk", "a box of milk", 1.5f, 2);
        // Prodotto parmigiano = new Prodotto("parmigiano", "LOREM", 1699.50f, 22);
        System.out.println("il nome completo é " + collector.nameComplete());

        System.out.println("il prezzo senza iva " + collector.priceDettail());
        System.out.println("il prezzo con iva è " + collector.priceAndIva());

        // System.out.println("il nome completo é " + parmigiano.nameComplete());

        // System.out.println("il prezzo senza iva " + parmigiano.priceDettail());
        // System.out.println("il prezzo con iva è " + parmigiano.priceAndIva());
    }
}
