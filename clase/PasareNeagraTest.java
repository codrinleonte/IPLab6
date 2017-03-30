package com.company;

import org.junit.Test;


public class PasareNeagraTest {

    @Test
    public PasareNeagraTest{

        PasareNeagra p = new PasareNeagra("black", 15, 5, 8);
        String culoare = "black";
        int arie = 20;
        int locatieX = 3;
        int locatieY = 7;
        assertEquals(culoare, p.culoare);
        assertEquals(arie, p.arie);
        assertEquals(locatieX, p.locatieX);
        assertEquals(locatieY, p.locatieY);
    }
}
