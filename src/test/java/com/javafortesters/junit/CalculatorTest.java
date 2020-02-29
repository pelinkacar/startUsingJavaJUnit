package com.javafortesters.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {


    @Test
    public void testSum(){
        int result = Calculator.sum(4,6);
        assertEquals(10, result);
    }

    @Test
    public void testDivide(){
        int result = Calculator.divide(6,2);
        assertEquals(3, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideZero(){
        Calculator.divide(6,0);
    }

    @Test
    public void testMultiple(){
        int result = Calculator.multiply(6,2);
        assertEquals(12, result);
    }

}