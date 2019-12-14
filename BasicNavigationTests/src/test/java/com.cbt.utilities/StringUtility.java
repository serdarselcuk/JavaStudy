package com.cbt.utilities;

public class StringUtility {
    public static String CheckStrings(String expected, String actual){
        String result ;
        if(expected.equals( actual )) {
            result = "PASS ";
        }
        else{
            result =  "FAIL !!! " ;
        }
        return result + ( "expected: " + expected + "  actualized: " + actual );
    }
}
