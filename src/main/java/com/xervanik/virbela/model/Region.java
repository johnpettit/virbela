package com.xervanik.virbela.model;

public class Region {
    private Integer id;
    private String name;

    public Region() {

    }

    public Region(Integer newId, String newName) {
        this.id = newId;
        this.name = newName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
