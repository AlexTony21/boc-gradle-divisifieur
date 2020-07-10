package com.github.dorval.francois.composant;


import com.github.dorval.francois.controller.Main;
import com.github.dorval.francois.util.Errors;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class MainTest {

    /*@Test
    public void testCasPassantBeteEtMechant() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        Main.main(new String[]{"6", "2"});

        Assert.assertEquals("6/2=3\n", bos.toString());

        System.setOut(originalOut);
    }*/

    @Test(expected = IllegalArgumentException.class)
    public void testCasKo() {
        Main.main(new String[]{"abcd"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCasDivZero()
    {
        Main.main(new String[] {"10", "0"});
    }
}
