package com.java.numbersystem;

public class PowerOfNumber {
    public static void main(String[] args) {
        int n=2;
        int power=3;
        System.out.println("Power of given number is:"+ power(n,power));
    }
    static int power(int n,int power)
    {
        int result=1;
        for(int i=1;i<=power;i++)
        {
            result=result*n;
        }
        return result;
    }
}
