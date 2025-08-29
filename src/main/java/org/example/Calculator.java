package org.example;

public class Calculator {

    public int add(int firstNum, int secondNum) {
        long result = (long) firstNum + secondNum;
        if (result > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("This value is too big");

        }
        return (int) result;
    }

    public int subtract(int firstNum, int secondNum) {
        long result = (long) firstNum - secondNum;
        if (result < 0) {
            throw new IllegalStateException("Negative Results Are not allowed");
        }
        return (int) result;
    }

    public int multiply(int firstNum, int secondNum) {
        long result = (long) firstNum * secondNum;
        if (result > Integer.MAX_VALUE) {
            throw new UnsupportedOperationException("Multiplication overflow");
        }
        return (int) result;
    }

    public int divide(int firstNum, int secondNum)
    {
        if(secondNum == 0)
        {
            throw new ArithmeticException("Cannot divide by zero");
        }
        long result = (long) firstNum / secondNum;
        if(result > Integer.MAX_VALUE)
        {
            throw new IllegalArgumentException("Result is too large");
        }
        return (int) result;
    }
}