package com.company;

import org.junit.Test;

import java.util.ArrayList;

public class GameSessionTest {


    @Test
    public GameSessionTest{

        GameSession g = new GameSession(levels, 12, 15, 30, 140);
        ArrayList<Level> levels = new ArrayList();
        Level l1 = new Level(1, "Level 1", 50);
        Level l2 = new Level(2, "Level 2", 100);
        Level l2 = new Level(3, "Level 3", 155);
        levels.add(l1);
        levels.add(l2);
        levels.add(l3);
        int TimeStart = 15;
        int TimeElapsed = 30;
        int Score = 140;

        assertEquals(levels, g.levels);
        assertEquals(TimeStart, g.TimeStart);
        assertEquals(TimeElapsed, g.TimeElapsed);
        assertEquals(Score, g.Score);

    }
