package com.codeclan.example.movietopten;

/**
 * Created by user on 22/05/2017.
 */

public class Movie {

    private String title;
    private String genre;
    private int rank;

     public Movie(String title, String genre, int rank) {
         this.title = title;
         this.genre = genre;
         this.rank = rank;
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

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
