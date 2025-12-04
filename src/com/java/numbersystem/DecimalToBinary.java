package com.java.numbersystem;

public class DecimalToBinary {
    public static void main(String[] args) {
        int dec=14;
        System.out.println(decToBinary(dec));
    }
    static String decToBinary(int n)
    {
        String bin="";
        while(n>0)
        {
            int rem=n%2;
            bin=rem+bin;
            n=n/2;

        }
        return bin;
    }
}
