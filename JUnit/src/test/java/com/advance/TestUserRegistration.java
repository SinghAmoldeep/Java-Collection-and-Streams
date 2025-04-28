package com.advance;

import com.advance.user_registration.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUserRegistration {

    @Test
    void testRegisterUser(){
        Assertions.assertTrue(UserRegistration.registerUser("Rishav" , "rishav7381@gmail.com" , "Rishav@123"));
    }
    @Test
    void testThrowException(){
        Assertions.assertThrows(IllegalArgumentException.class ,()-> UserRegistration.registerUser("Rishav" , "rishav7381" , "Rishav@123"));
    }
}
