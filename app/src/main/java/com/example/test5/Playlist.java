package com.example.test5;

public class Playlist extends Song {
    private String tag;
    private  String woche;
    private String monat;

    public Playlist() {
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getWoche() {
        return woche;
    }

    public void setWoche(String woche) {
        this.woche = woche;
    }

    public String getMonat() {
        return monat;
    }

    public void setMonat(String monat) {
        this.monat = monat;
    }

    public Playlist(String tag, String woche, String monat) {
        this.tag = tag;
        this.woche = woche;
        this.monat = monat;

    }
}

