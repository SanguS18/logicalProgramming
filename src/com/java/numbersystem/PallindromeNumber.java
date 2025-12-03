package com.java.numbersystem;

public class PallindromeNumber {
    public static void main(String[] args) {
        int n=121;
        if(isPallindrome(n))
        {
            System.out.println(n+" is a Pallindrome Number");
        }
        else
        {
            System.out.println(n+" is not a Pallindrome Number");
        }
    }
    static boolean isPallindrome(int n)
    {
        int temp=n;
        int rev=0;
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev==temp;
    }
}
