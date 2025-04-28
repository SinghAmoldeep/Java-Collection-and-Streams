package com.testing;

import com.testing.calculator.Calculator;
import com.testing.string_utils.String_Utilities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilitiesTest {
    private String_Utilities stu;
    @BeforeEach
    void setUp(){
        stu=new String_Utilities();
    }

    @Test
    void testReverse(){
        assertEquals("hello",stu.reverse("olleh"));
    }

    @Test
    void testIsPalindrome(){
        assertTrue(stu.isPalindrome("ala"));
    }

    @Test
    void testUpperCase(){
        assertEquals("RISHAV",stu.toUpperCase("rishav"));
    }
}
