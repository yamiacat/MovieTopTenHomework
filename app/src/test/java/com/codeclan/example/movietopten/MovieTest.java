package com.codeclan.example.movietopten;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22/05/2017.
 */
public class MovieTest {


    @Test
    public void canGetTitle() {
        Movie movie = new Movie("The Room");
        assertEquals("The Room", movie.getTitle());
    }


    @Test
    public void canGetTitle() {
        Movie movie = new Movie("The Room");
        assertEquals("The Room", movie.getTitle());
    }

}