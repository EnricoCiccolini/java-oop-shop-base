package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Prodotto collector = new Prodotto("Magic", "pacchetto del gioco magic the gathering", 8, 22);
        Prodotto milk = new Prodotto("Milk", "a box of milk", 1.5f, 2);

        System.out.println("il nome completo é " + collector.nameComplete());

        System.out.println("il prezzo senza iva " + collector.priceDettail());
        System.out.println("il prezzo con iva è " + collector.priceAndIva());

    }
}
