package com.example.SpringBootMVC.model;

public class Alien {
    private int aid;
    private String aname;


    public Alien() {
    }

    public Alien(int aid, String aname) {
        this.aid = aid;
        this.aname = aname;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }
}
