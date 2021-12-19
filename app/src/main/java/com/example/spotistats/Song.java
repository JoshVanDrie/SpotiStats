package com.example.spotistats;

import java.sql.Time;
import java.util.Timer;

public class Song {
    private String title;
    private Album album;
    private Artist artist;
    private Time length;
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Time getLength() {
        return length;
    }

    public void setLength(Time length) {
        this.length = length;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
