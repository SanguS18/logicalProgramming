package com.java.numbersystem;

public class StrongNumber {
    public static void main(String[] args) {
        int n=145;
        if(isStrongNumber(n))
        {
            System.out.println(n+" is a Strong Number");
        }
        else
        {
            System.out.println(n+" is not a Strong Number");
        }
    }
    static boolean isStrongNumber(int n)
    {
        int sum=0;
        int temp=n;
        while(n>0)
        {
            sum=sum+factorial(n%10);
            n=n/10;
        }
        return sum==temp;

    }
    static int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}
