package ru.kovshov.shop.model;

public class Car {

    private int id;
    private String name;
    private int dateManufacturing;
    private int price;
    private String description;

    private String picAvatar;

    private String pics;


    public Car(String name, int dateManufacturing, int price, String description) {
        this.name = name;
        this.dateManufacturing = dateManufacturing;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateManufacturing() {
        return dateManufacturing;
    }

    public void setDateManufacturing(int dateManufacturing) {
        this.dateManufacturing = dateManufacturing;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicAvatar() {
        return picAvatar;
    }

    public void setPicAvatar(String picAvatar) {
        this.picAvatar = picAvatar;
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

}
