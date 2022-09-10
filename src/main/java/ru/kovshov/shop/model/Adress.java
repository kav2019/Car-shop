package ru.kovshov.shop.model;

public class Adress {
    private int postCode;
    private String country;
    private String city;
    private String street;
    private String houseRoom;

    public Adress(int postCode, String country, String city, String street, String houseRoom) {
        this.postCode = postCode;
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseRoom = houseRoom;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseRoom() {
        return houseRoom;
    }

    public void setHouseRoom(String houseRoom) {
        this.houseRoom = houseRoom;
    }

    @Override
    public String toString() {
        return "postCode: " + postCode +
                ", country: " + country +
                ", city: " + city +
                ", street: " + street +
                ", houseRoom: " + houseRoom;
    }
}
