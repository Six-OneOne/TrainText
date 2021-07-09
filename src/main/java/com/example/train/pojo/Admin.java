package com.example.train.pojo;

public class Admin {

    private int id;
    private String adminmane;
    private String passsword;
    private int age;
    private int phone;

    public Admin(int id, String adminmane, String passsword, int age, int phone) {
        this.id = id;
        this.adminmane = adminmane;
        this.passsword = passsword;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", adminmane='" + adminmane + '\'' +
                ", passsword='" + passsword + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdminmane() {
        return adminmane;
    }

    public void setAdminmane(String adminmane) {
        this.adminmane = adminmane;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
