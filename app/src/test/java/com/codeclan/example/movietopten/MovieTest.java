package com.codeclan.example.movietopten;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22/05/2017.
 */
public class MovieTest {


    @Test
    public void canGetTitle() {
        Movie movie = new Movie("The Room", "Psychodrama");
        assertEquals("The Room", movie.getTitle());
    }

    @Test
    public void canSetTitle() {
        Movie movie = new Movie("The Room", "Psychodrama");
        movie.setTitle("Citizen Kane");
        assertEquals("Citizen Kane", movie.getTitle());
    }

    @Test
    public void canGetGenre() {
        Movie movie = new Movie("The Room", "Psychodrama");
        assertEquals("Psychodrama", movie.getGenre());
    }

    @Test
    public void canSetGenre() {
        Movie movie = new Movie("The Room", "Psychodrama");
        movie.setGenre("Black Comedy");
        assertEquals("Black Comedy", movie.getGenre());
    }

}