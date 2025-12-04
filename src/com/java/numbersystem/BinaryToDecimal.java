package com.java.numbersystem;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int  bin=1101;
        System.out.println(binaryToDecimal(bin));
    }
    static int binaryToDecimal(int n)
    {
        int sum=0,p=0;
        while(n>0)
        {
            int rem=n%10;
            int pow=(int)Math.pow(2,p);
            sum=sum+rem*pow;
            n=n/10;
            p++;
        }
        return sum;
    }
}
