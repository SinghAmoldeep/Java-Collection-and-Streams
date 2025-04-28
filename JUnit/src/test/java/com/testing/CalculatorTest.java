package com.testing;


import com.testing.calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator cal;
    @BeforeEach
    void setUp(){
        cal=new Calculator();
    }

    @Test
    void testAdd(){
        assertEquals(10,cal.add(5,5));
    }

    @Test
    void testSubtract(){
        assertEquals(10,cal.subtract(20,10));
    }

    @Test
    void testMultiply(){
        assertEquals(15,cal.multiply(5,3));
    }
    @Test
    void testDivide(){
        assertEquals(1,cal.divide(5,5));
    }

    @Test
    void testDivideByZero(){
        assertThrows(ArithmeticException.class,()->cal.divide(5,0));
    }

}
