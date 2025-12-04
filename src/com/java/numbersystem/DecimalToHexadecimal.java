package com.java.numbersystem;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        int dec=65;
        System.out.println(decimalToHexadecimal(dec));
    }
    static String decimalToHexadecimal(int n)
    {
        String hex="";
        while(n>0)
        {
            int rem=n%16;
            if(rem>9)
            {
                hex=(char)(rem+55)+hex;
            }
            else{
                hex=rem+hex;
            }
            n=n/16;
        }
        return hex;
    }
}
