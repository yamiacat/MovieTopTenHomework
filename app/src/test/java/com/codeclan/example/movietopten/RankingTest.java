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

}