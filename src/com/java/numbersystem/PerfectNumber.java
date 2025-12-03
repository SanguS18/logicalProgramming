package com.java.numbersystem;

public class PerfectNumber {
    public static void main(String[] args) {
        int number=6;
        isPerfectNumber(number);
    }
    public static void isPerfectNumber(int number){
        int sum=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum=sum+i;
            }
        }
        if(sum==number){
            System.out.println(number+" is a Perfect Number");
        }else{
            System.out.println(number+" is not a Perfect Number");
        }
    }
}
