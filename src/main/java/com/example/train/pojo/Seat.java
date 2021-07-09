package com.example.train.pojo;

public class Seat {
    private String id;
    private String classname;
    private int state;
    private  int car;
    private int site;

    public Seat(String id, String classname, int state, int car, int site) {
        this.id = id;
        this.classname = classname;
        this.state = state;
        this.car = car;
        this.site = site;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id='" + id + '\'' +
                ", classname='" + classname + '\'' +
                ", state=" + state +
                ", car=" + car +
                ", site=" + site +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
    }

    public int getSite() {
        return site;
    }

    public void setSite(int site) {
        this.site = site;
    }
}
