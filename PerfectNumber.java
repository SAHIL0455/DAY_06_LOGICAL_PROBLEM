package com.brigdelabs;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i<num; i++){
            if (num % i == 0){
                sum += i;
            }
        }
        if (sum == num){
            System.out.println("This is Perfect Number");
        }else {
            System.out.println("This is not Perfect Number");
        }
    }
}