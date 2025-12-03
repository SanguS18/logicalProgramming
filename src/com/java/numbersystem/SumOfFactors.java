package com.java.numbersystem;

public class SumOfFactors {
    public static void main(String[] args) {
        int number = 28; // You can change this number to find sum of factors of a different number
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of factors of " + number + " is: " + sum);
    }
}
