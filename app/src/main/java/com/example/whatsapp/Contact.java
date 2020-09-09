package com.example.whatsapp;

public class Contact {
    private String name;
    private String msg;
    private String time;
    private int image;

    public Contact() {
    }
    public Contact(String name, String msg, String time, int image) {
        this.name = name;
        this.msg = msg;
        this.time = time;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getMsg() {
        return msg;
    }

    public String getTime() {
        return time;
    }

    public int getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
