package com.java.numbersystem;

public class FirstNPrimeNumber {
public static void main(String[] args) {
    int n=5;
    int count=0;
    int i=2;
    while (true)
         {
        if(isPrime(i))
        {
            System.out.println(i+" ");
            count++;
            if(count==n)
            {
                break;
            }
        }
        i++;
        
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
