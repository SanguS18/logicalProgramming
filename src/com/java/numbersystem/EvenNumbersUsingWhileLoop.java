package com.java.numbersystem;

public class EvenNumbersUsingWhileLoop {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 1000 using while loop:");
        int i = 2;
        while (i <= 1000) {
            System.out.println(i + " ");
            i += 2;
        }
    }
}
