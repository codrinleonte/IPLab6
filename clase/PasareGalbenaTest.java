package com.company;

import org.junit.Test;


public class PasareGalbenaTest {

    @Test
    public PasareGalbena() {


        PasareGalbena p = new PasareGalbena("yellow", 15, 5, 8);
        String culoare = "yellow";
        int arie = 15;
        int locatieX = 5;
        int locatieY = 8;
        assertEquals(culoare, p.culoare);
        assertEquals(arie, p.arie);
        assertEquals(locatieX, p.locatieX);
        assertEquals(locatieY, p.locatieY);
    }
}