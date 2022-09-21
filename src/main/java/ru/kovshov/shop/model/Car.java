package ru.kovshov.shop.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "dateManufacturing")
    private int dateManufacturing;

    @Column(name = "price")
    private int price;

    @Column(name = "description")
    private String description;

    @Column(name = "picAvatar")
    private String picAvatar;

    @Column(name = "pics")
    private String pics;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public Car(String name, int dateManufacturing, int price, String description) {
        this.name = name;
        this.dateManufacturing = dateManufacturing;
        this.price = price;
        this.description = description;
    }

    public Car() {
    }

    public int getId() {
        return id;
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

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
