package com.java.numbersystem;

public class CountTheFactors {
    public static void main(String[] args) {
        int number = 28; // You can change this number to count factors of a different number
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        System.out.println("Total number of factors of " + number + " is: " + count);
    }
}
