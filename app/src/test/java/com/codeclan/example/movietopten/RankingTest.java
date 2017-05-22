package com.codeclan.example.movietopten;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22/05/2017.
 */
public class RankingTest {

    @Test
    public void rankingArrayStartsPopulated() {
        Ranking ranking = new Ranking();
        assertEquals(10, ranking.getRankingListCount());
    }

    @Test
    public void canGetMovieByRank() {
        Ranking ranking = new Ranking();
        assertEquals("Bladerunner", ranking.getMovieByRank(1).getTitle());
    }

    @Test
    public void canGetMovieByRankTwo() {
        Ranking ranking = new Ranking();
        assertEquals("Akira", ranking.getMovieByRank(7).getTitle());
    }

    @Test
    public void canReplaceMovieByRank() {
        Ranking ranking = new Ranking();
        Movie movie = new Movie("Prometheus", "Scifi", 10);
        ranking.replaceMovie(movie);
        assertEquals("Prometheus", ranking.getMovieByRank(10).getTitle());
    }

    @Test
    public void canFindMovieByTitle() {
        Ranking ranking = new Ranking();
        assertEquals(7, ranking.findMovieByTitle("Akira").getRank());
    }

    @Test
    public void canIncreaseMovieRankingByTitle() {
        Ranking ranking = new Ranking();
        ranking.increaseRanking("Akira");
        assertEquals(6, ranking.findMovieByTitle("Akira").getRank());
    }

    @Test
    public void canIncreaseMovieRankingByTitleAndChangeIndex() {
        Ranking ranking = new Ranking();
        ranking.increaseRanking("Akira");
        assertEquals("Akira", ranking.getMovieByRank(6).getTitle());
    }


}