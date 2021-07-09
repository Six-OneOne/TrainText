package com.example.train.pojo;

public class TrainType {
    private String car;
    private int seat;
    private int carriage;
    private int length;
    private String type;

    public TrainType(String car, int seat, int carriage, int length, String type) {
        this.car = car;
        this.seat = seat;
        this.carriage = carriage;
        this.length = length;
        this.type = type;
    }

    @Override
    public String toString() {
        return "TrainType{" +
                "car='" + car + '\'' +
                ", seat=" + seat +
                ", carriage=" + carriage +
                ", length=" + length +
                ", type='" + type + '\'' +
                '}';
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getCarriage() {
        return carriage;
    }

    public void setCarriage(int carriage) {
        this.carriage = carriage;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
