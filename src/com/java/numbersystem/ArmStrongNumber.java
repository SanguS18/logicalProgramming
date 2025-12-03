package com.java.numbersystem;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int n=153;
        if(isArmStrong(n))
        {
            System.out.println(n+" is an Armstrong number");
        }
        else
        {
            System.out.println(n+" is not an Armstrong number");
        }
    }
    static boolean isArmStrong(int n)
    {
        int sum=0;
        int temp=n;
        int cd=countOfDigits(n);
        while(n>0)
        {
            int rem=n%10;
            int pow=power(rem,cd);
            sum=sum+pow;
            n=n/10;
        }
        return sum==temp;
    }
    static int countOfDigits(int n)
    {
        int count=0;
        while(n>0)
        {
            count++;
            n=n/10;
        }
        return count;
    }
    static int power(int base,int exp)
    {
        int result=1;
        for(int i=1;i<=exp;i++)
        {
            result=result*base;
        }
        return result;
    }
}
