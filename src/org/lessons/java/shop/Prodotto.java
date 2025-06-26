package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    int barcode;
    String name;
    String description;
    float price;
    int iva;

    public Prodotto(String name, String description, float price, int iva) {
        Random random = new Random();
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
        this.barcode = random.nextInt(90000) + 10000;

    }

    public float priceDettail() {
        // System.out.println("il prezzo base é");
        // System.out.println(this.price);
        return this.price;
    }

    public float priceAndIva() {
        // System.out.println("il prezzo con iva è");
        float totalPrice = this.price + ((this.price * this.iva) / 100);
        // System.out.println(totalPrice);
        return totalPrice;
    }

    public String nameComplete() {
        // System.out.println("il nome completo é");
        // System.out.println(this.barcode + this.name);
        String nameCom = this.barcode + this.name;
        return nameCom;
    }

}
