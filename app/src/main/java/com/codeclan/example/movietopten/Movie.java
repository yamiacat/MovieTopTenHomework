package com.codeclan.example.movietopten;

/**
 * Created by user on 22/05/2017.
 */

public class Movie {

    private String title;
    private String genre;

     public Movie(String title, String genre) {
        this.title = title;
         this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
