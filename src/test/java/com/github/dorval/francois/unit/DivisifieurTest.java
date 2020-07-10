package com.github.dorval.francois.unit;

import com.github.dorval.francois.business.Divisifieur;
import com.github.dorval.francois.util.Errors;
import org.junit.Assert;
import org.junit.Test;

public class DivisifieurTest {

    @Test
    public void testUnitaire(){
        int result = Divisifieur.diviser(10, 5);
        Assert.assertEquals(result, 2);
    }
}
