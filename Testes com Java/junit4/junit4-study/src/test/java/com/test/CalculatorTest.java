package com.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(0, Calculator.add("a"));
        assertEquals(0, Calculator.add("0"));
        assertEquals(3, Calculator.add("1-2"));
        assertEquals(1, Calculator.add("1a "));
        assertEquals(6, Calculator.add("1+2+3"));
    }
}
