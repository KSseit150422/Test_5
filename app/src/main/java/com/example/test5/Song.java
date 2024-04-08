package com.example.test5;

public class Song
{
    private int id;
    private String interpreter;
    private String titel;
    private double songlaenge;
    private String album;
    private String coverUrl;
    private String songFileUrl;

    public Song() {
    }

    public Song(int id, String interpreter, String titel, double songlaenge, String album, String coverUrl, String songFileUrl) {
        this.id = id;
        this.interpreter = interpreter;
        this.titel = titel;
        this.songlaenge = songlaenge;
        this.album = album;
        this.coverUrl = coverUrl;
        this.songFileUrl = songFileUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInterpreter() {
        return interpreter;
    }

    public void setInterpreter(String interpreter) {
        this.interpreter = interpreter;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public double getSonglaenge() {
        return songlaenge;
    }

    public void setSonglaenge(double songlaenge) {
        this.songlaenge = songlaenge;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getSongFileUrl() {
        return songFileUrl;
    }

    public void setSongFileUrl(String songFileUrl) {
        this.songFileUrl = songFileUrl;
    }
}