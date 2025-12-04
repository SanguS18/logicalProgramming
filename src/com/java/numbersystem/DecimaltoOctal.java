package com.java.numbersystem;

public class DecimaltoOctal {
    public static void main(String[] args) {
        int dec=75;
        System.out.println(decToOctal(dec));
    }
    static String decToOctal(int n)
    {
        String oct="";
        while(n>0)
        {
            int rem=n%8;
            oct=rem+oct;
            n=n/8;

        }
        return oct;
    }
}
