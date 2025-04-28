package com.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.testing.is_even.IsEven.isEven;

public class IsEvenTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 7,10})
    void testIsEven(int num) {
        Assertions.assertTrue(isEven(num),num +" is not even ");
    }
}
