package ru.kovshov.shop.model;

import java.util.List;

public class User {
    private int id;
    private String name;
    private Adress adress;
    private long phoneNumber;
    private String picAvatar;
    private List<Car> cars;

    public User() {
    }

    public User(String name, Adress adress, long phoneNumber, String picAvatar) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.picAvatar = picAvatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPicAvatar() {
        return picAvatar;
    }

    public void setPicAvatar(String picAvatar) {
        this.picAvatar = picAvatar;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
