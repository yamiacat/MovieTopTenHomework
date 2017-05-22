package com.codeclan.example.movietopten;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22/05/2017.
 */
public class MovieTest {


    @Test
    public void canGetTitle() {
        Movie movie = new Movie("The Room", "Psychodrama", 2);
        assertEquals("The Room", movie.getTitle());
    }

    @Test
    public void canSetTitle() {
        Movie movie = new Movie("The Room", "Psychodrama", 2);
        movie.setTitle("Citizen Kane");
        assertEquals("Citizen Kane", movie.getTitle());
    }

    @Test
    public void canGetGenre() {
        Movie movie = new Movie("The Room", "Psychodrama", 2);
        assertEquals("Psychodrama", movie.getGenre());
    }

    @Test
    public void canSetGenre() {
        Movie movie = new Movie("The Room", "Psychodrama", 2);
        movie.setGenre("Black Comedy");
        assertEquals("Black Comedy", movie.getGenre());
    }

    @Test
    public void canGetRank() {
        Movie movie = new Movie("The Room", "Psychodrama", 2);
        assertEquals(2, movie.getRank());
    }

    @Test
    public void canSetRank() {
        Movie movie = new Movie("The Room", "Psychodrama", 2);
        movie.setRank(1);
        assertEquals(1, movie.getRank());
    }

    @Test
    public void toStringOverriden() {
        Movie movie = new Movie("The Room", "Psychodrama", 1);
        assertEquals("Title: The Room, Genre: Psychodrama, Rank: 1", movie.toString());
    }
}