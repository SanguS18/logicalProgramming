package com.java.numbersystem;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Odd numbers from 1 to 50:");
        for (int i = 1; i <= 50; i+=2) {
            sum += i;
            System.out.println(i + " ");
        }
        System.out.println("Sum of odd numbers from 1 to 50: " + sum);
    }
}
