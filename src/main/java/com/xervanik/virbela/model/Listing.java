package com.xervanik.virbela.model;

public class Listing {
    private Integer id;
    private String title;
    private String description;
    private float price;

    public Listing() {

    }

    public Listing(Integer newId, String newTitle, String newDescription, float newPrice){
        this.id = newId;
        this.title = newTitle;
        this.description = newDescription;
        this.price = newPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
