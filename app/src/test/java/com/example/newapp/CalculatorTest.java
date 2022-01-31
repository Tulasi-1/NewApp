package com.example.newapp;

import junit.framework.TestCase;
public class CalculatorTest extends TestCase {
    public void testAdd(){
        int expected = 30;
        int actual = Calculator.add(a: 10,b: 20);

        assertEquals(expected,actual);
    }
  
}