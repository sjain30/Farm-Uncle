package com.ntas.FarmUncle;

public class Product {
    private int id;
    private String title;
    private double price,rating;
    private int image;

    public Product(int id, String title, double price, double rating, int image) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getImage() {
        return image;
    }
}
