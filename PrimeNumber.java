package com.brigdelabs;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean prime = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        for (int i = 2; i < num; i++){
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime){
            System.out.println("This is Prime");
        }else {
            System.out.println("This is not Prime");
        }
    }
}