package com.ntas.FarmUncle;

public class Product {
    private int id,qty;
    private String title;
    private double price,rating,cuttedPrice;
    private int image;

    public Product(int id, int qty, String title, double price, double rating, double cuttedPrice, int image) {
        this.id = id;
        this.qty = qty;
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.cuttedPrice = cuttedPrice;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getCuttedPrice() {
        return cuttedPrice;
    }

    public void setCuttedPrice(double cuttedPrice) {
        this.cuttedPrice = cuttedPrice;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
