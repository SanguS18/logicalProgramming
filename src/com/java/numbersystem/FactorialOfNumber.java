package com.java.numbersystem;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int n=4;
        int fact=factorial(n);
        System.out.println("Factorial of "+n+" is: "+fact);
    }
    public static int factorial(int n)
    {
        int fact=1;
        for (int i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        return fact;
    }
}
