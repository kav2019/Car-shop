package ru.kovshov.shop.model;

public class Order {
    private int id;
    private int user_id;
    private int car_id;

    public Order(int user_id, int car_id) {
        this.user_id = user_id;
        this.car_id = car_id;
    }

    public Order() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }
}
