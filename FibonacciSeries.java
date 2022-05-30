package com.brigdelabs;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int num = 10;
        for (int i = 2; i < num; i++) {
            int fibonacci = a + b;                 // fibonacci = 0+1 = 1
            System.out.println(fibonacci);
            a = b;                                 // a = 1
            b = fibonacci;                         // b = 1
        }
    }
 }
