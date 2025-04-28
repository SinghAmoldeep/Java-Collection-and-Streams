package com.advance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.advance.password_strength_validator.PasswordValidator.validate;

public class TestPasswordValidator {

    @ParameterizedTest
    @ValueSource(strings = {"Ri@1456ov", "Sa@3349hl" })  // last password will fail the test case
    void testValidate(String pas){
        Assertions.assertTrue(validate(pas));
    }


    @ParameterizedTest
    @ValueSource(strings = {"jsjs92dd" ,"amn33"})  // last password will fail the test case
    void testNotValidate(String pas){
        Assertions.assertTrue(validate(pas));
    }

}
