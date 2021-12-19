package com.example.spotistats;

import java.net.URL;
import java.sql.Time;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Date;

public class Album {

   private ArrayList <Song> songs;
   private Artist artist;
   private String url;
   private Date time;

   public Date getTime() {
      return time;
   }

   public void setTime(Date time) {
      this.time = time;
   }



   public ArrayList<Song> getSongs() {
      return songs;
   }

   public void setSongs(ArrayList<Song> songs) {
      this.songs = songs;
   }

   public Artist getArtist() {
      return artist;
   }

   public void setArtist(Artist artist) {
      this.artist = artist;
   }

   public String getUrl() {
      return url;
   }

   public void setUrl(String url) {
      this.url = url;
   }

}
