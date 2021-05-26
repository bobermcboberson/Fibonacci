package com.company;

public class FibonacciSequence implements Fibonacci{
    // Fields
    int amountofNumbersInSequence = 0;
    int number1 = 0;
    int number2 = 0;

    // Constructor
    FibonacciSequence(int amount, int num1, int num2) {
        amountofNumbersInSequence =  amount;
        number1 = num1;
        number2 = num2;
    }

    // Methods
    public void run() {
        int sum;
        System.out.println(number1);
        System.out.println(number2);
        for (int i = 0; i < amountofNumbersInSequence; i++) {
            sum = number1 + number2;
            number1 = number2;
            number2 = sum;
            System.out.println(sum);
        }
    }
}
