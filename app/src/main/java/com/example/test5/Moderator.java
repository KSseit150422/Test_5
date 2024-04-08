package com.example.test5;

public class Moderator {
    private String name;
    private String vorname;
    private String Kuenstlername;

    public Moderator() {
    }

    public Moderator(String name, String vorname, String kuenstlername) {
        this.name = name;
        this.vorname = vorname;
        Kuenstlername = kuenstlername;
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

    public String getKuenstlername() {
        return Kuenstlername;
    }

    public void setKuenstlername(String kuenstlername) {
        Kuenstlername = kuenstlername;
    }
}
