package com.ntas.FarmUncle;

import android.widget.ImageView;

public class Product {
    private int id;
    private String title;
    private String qty, price,cuttedPrice;
    private int image;

    public Product(int id, String qty, String title, String price, String cuttedPrice, int image) {
        this.id = id;
        this.qty = qty;
        this.title = title;
        this.price = price;
        this.cuttedPrice = cuttedPrice;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCuttedPrice() {
        return cuttedPrice;
    }

    public void setCuttedPrice(String cuttedPrice) {
        this.cuttedPrice = cuttedPrice;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
