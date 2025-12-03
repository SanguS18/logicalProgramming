package com.java.numbersystem;

public class ArmStrongNumber2 {
    public static void main(String[] args) {
        int n=153;
        System.out.println((isArmStrong(n))?"ArmStrong Number":"Not an ArmStrong Number");
    
    }
    static boolean isArmStrong(int n)
    {
        String s=n+"";
        int cd=s.length();
        int sum=0;
        int temp=n;
        while(n>0)
        {
            int rem=n%10;
            int pow=(int)Math.pow(rem,cd);
            sum=sum+pow;
            n=n/10;
        }
        return sum==temp;

    }
}
