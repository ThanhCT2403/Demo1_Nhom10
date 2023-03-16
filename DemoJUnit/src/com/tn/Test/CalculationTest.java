package com.tn.Test;

import com.tn.Calculation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculationTest {
    @Test
    public void sum1Test(){
        Integer result = new Calculation().sum(5,6);
        assertEquals(11,result);
    }
    @Test
    public void sum2Test(){
        Integer result = new Calculation().sum(-5,6);
        assertEquals(null,result);
    }
    @Test
    public void sum3Test(){
        Integer result = new Calculation().sum(6,5);
        assertNull(null);
    }

}
