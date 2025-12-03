package com.java.numbersystem;

public class NeonNumber {
    public static void main(String[] args) {
        int n=9;
        if(isNeon(n))
        {
            System.out.println(n+" is a Neon Number");
        }
        else
        {
            System.out.println(n+" is not a Neon Number");
        }
    }
    static boolean isNeon(int n)
    {
        int sum=0;
        int sq=n*n;
        while(sq>0)
        {
            int rem=sq%10;
            sum=sum+rem;
            sq=sq/10;
        }
        return sum==n;
    }
}
