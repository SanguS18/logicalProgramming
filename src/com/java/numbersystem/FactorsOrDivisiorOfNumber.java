package com.java.numbersystem;

public class FactorsOrDivisiorOfNumber {
    public static void main(String[] args) {
        int number = 28; // You can change this number to find factors of a different number
        System.out.println("Factors or Divisors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
