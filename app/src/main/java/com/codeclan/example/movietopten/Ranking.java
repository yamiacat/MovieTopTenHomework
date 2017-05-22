package com.codeclan.example.movietopten;

import java.util.ArrayList;

/**
 * Created by user on 22/05/2017.
 */

public class Ranking {
    private ArrayList<Movie> rankingList;

    public Ranking() {
        this.rankingList = new ArrayList<>();
        setupDefaultContent();
    }

    private void setupDefaultContent() {
        Movie movie1 = new Movie("Bladerunner", "Scifi", 1);
        Movie movie2 = new Movie("Brazil", "Satire", 2);
        Movie movie3 = new Movie("Seven Samurai", "Historical Drama", 3);
        Movie movie4 = new Movie("Waking Life", "Animation", 4);
        Movie movie5 = new Movie("2001: A Space Odyssey", "Scifi", 5);
        Movie movie6 = new Movie("The Good, The Bad & The Ugly", "Western", 6);
        Movie movie7 = new Movie("Akira", "Animation", 7);
        Movie movie8 = new Movie("Taxi Driver", "Crime", 8);
        Movie movie9 = new Movie("Being There", "Satire", 9);
        Movie movie10 = new Movie("The Room", "Historical Drama", 10);

        this.rankingList.add(movie1);
        this.rankingList.add(movie2);
        this.rankingList.add(movie3);
        this.rankingList.add(movie4);
        this.rankingList.add(movie5);
        this.rankingList.add(movie6);
        this.rankingList.add(movie7);
        this.rankingList.add(movie8);
        this.rankingList.add(movie9);
        this.rankingList.add(movie10);

    }


    public int getRankingListCount() {
        return this.rankingList.size();
    }















}
