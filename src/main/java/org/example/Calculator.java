package org.example;

public class Calculator {

    public int add(int firstNum, int secondNum)
    {
        long result = (long) firstNum + secondNum;
        if(result > Integer.MAX_VALUE)
        {
            throw new IllegalArgumentException("This value is too big");

        }
        return (int) result;
    }
}
