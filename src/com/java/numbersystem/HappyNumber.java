package com.java.numbersystem;

public class HappyNumber {
    public static void main(String[] args) {
        int n=97;
        if(isStrong(n))
        {
            System.out.println(n+" is a Happy Number");
        }
        else
        {
            System.out.println(n+" is not a Happy Number");
        }
    }
    static boolean isStrong(int n)
    {
        while(n>9)
        {
            int sum=0;
            while(n>0)
            {
                int rem=n%10;
                sum=sum+rem*rem;
                n=n/10;
            }
            n=sum;
        }
        return n==1;
    }
}
