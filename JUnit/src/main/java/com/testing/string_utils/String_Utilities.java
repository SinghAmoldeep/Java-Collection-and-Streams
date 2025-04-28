package com.testing.string_utils;

public class String_Utilities {
    public String reverse(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }
    public boolean isPalindrome(String str){
        String st=reverse(str);
        return st.equals(str);
    }
    public String toUpperCase(String str){
        return str.toUpperCase();
    }
}
