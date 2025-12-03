package com.java.numbersystem;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=11;
        if(isPrime(n))
        {
            System.out.println(n+" is a Prime Number");
        }
        else
        {
            System.out.println(n+" is not a Prime Number");
        }
    }
    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%2==0)
            {
                return false;
            }
        }
        return true;
    }
}
