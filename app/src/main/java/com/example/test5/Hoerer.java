package com.example.test5;

public class Hoerer {
    private String name;
    private String vorname;
    private int bewerten;
    private String meinung;

    public Hoerer() {
    }

    public Hoerer(String name, String vorname, int bewerten, String meinung) {
        this.name = name;
        this.vorname = vorname;
        this.bewerten = bewerten;
        this.meinung = meinung;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getBewerten() {
        return bewerten;
    }

    public void setBewerten(int bewerten) {
        this.bewerten = bewerten;
    }

    public String getMeinung() {
        return meinung;
    }

    public void setMeinung(String meinung) {
        this.meinung = meinung;
    }
}
