package ru.kovshov.shop.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "adress")
    private String adress;

    @Column(name = "phoneNumber")
    private long phoneNumber;

    @Column(name = "picAvatar")
    private String picAvatar;

    @OneToMany(mappedBy = "user")
    private List<Car> cars;




//    private boolean isAuth;



    public User() {
    }

    public User(String name, String password, String adress, long phoneNumber, String picAvatar) {
        this.name = name;
        this.password = password;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
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

//    public boolean isAuth() {
//        return isAuth;
//    }
//
//    public void setAuth(boolean auth) {
//        isAuth = auth;
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
