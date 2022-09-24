package com.example.greenify;

public class Model {
    String about,image,name;
    int quantity,price;

    public Model() {
    }

    public Model(String about, String image, String name, int quantity, int price) {
        this.about = about;
        this.image = image;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
