package com.java.numbersystem;

public class GreatestCommonDivisior {
    public static void main(String[] args) {
        int a=10,b=20;
        int gcd=0;
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0&&b%i==0)
            {
                gcd=i;

            }
        }
        System.out.println("GCD of "+a+" and "+b+" is: "+gcd);
    }
}
