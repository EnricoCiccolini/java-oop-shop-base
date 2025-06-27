package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    private int barcode;
    private String name;
    private String brand;
    private BigDecimal price;
    private BigDecimal iva;

    Random random = new Random();

    public Prodotto() {
        this.name = "";
        this.brand = "";
        this.price = null;
        this.iva = null;
        this.barcode = random.nextInt(90000) + 10000;
    }

    public Prodotto(String name, String brand, BigDecimal price, BigDecimal iva) {

        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = iva;
        this.barcode = random.nextInt(90000) + 10000;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getbrand() {
        return brand;
    }

    public BigDecimal priceDettail() {
        // System.out.println("il prezzo base é");
        // System.out.println(this.price);
        return this.price;
    }

    public BigDecimal priceAndIva() {
        // System.out.println("il prezzo con iva è");
        BigDecimal totalPrice = this.price.add(this.price.multiply(this.iva)).setScale(2, RoundingMode.DOWN);
        // System.out.println(totalPrice);
        return totalPrice;
    }

    public String nameComplete() {
        // System.out.println("il nome completo é");
        // System.out.println(this.barcode + this.name);
        String nameCom = this.barcode + "-" + this.name;
        return nameCom;
    }

}
