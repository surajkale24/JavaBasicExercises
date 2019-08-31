package com.yash.test;

public class FactorialDemo {
    public int fact(int number) {
        int i = 1;
        int result = 1;
        while (i <= number) {
            result = result * i;
            i++;
        }
        return result;
    }
}