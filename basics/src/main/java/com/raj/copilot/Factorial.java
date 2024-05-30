package com.raj.copilot;

import java.math.BigInteger;

public class Factorial {
    
    public static BigInteger calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        } else if (number == 0 || number == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(number).multiply(calculateFactorial(number - 1));
        }
    }
    public static void main(String[] args) {
        int number = 14; // Replace with your desired number
        BigInteger factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
