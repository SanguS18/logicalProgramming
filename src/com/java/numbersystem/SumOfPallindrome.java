package com.java.numbersystem;

public class SumOfPallindrome {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=1000;i++)
        {
            if(isPallindrome(i))
            {
                sum=sum+i;
            }
        }
        System.out.println("Sum of Pallindrome numbers from 1 to 1000 is: "+sum);
    }
    static boolean isPallindrome(int n)
    {
        int rev=0;
        int temp=n;
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev==temp;
    }
}
