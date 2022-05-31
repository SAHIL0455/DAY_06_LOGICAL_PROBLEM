package com.brigdelabs;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        System.out.println("Enter the 1 when start the Stopwatch");
        Scanner scanner = new Scanner(System.in);
        long startTime = scanner.nextInt();
        startTime = System.currentTimeMillis();
        System.out.println("Enter the 2 when stop the Stopwatch");
        long endTime = scanner.nextInt();
        endTime = System.currentTimeMillis();
        long elapseTime = endTime - startTime;
        System.out.println("Executing of program Time " +elapseTime);
    }
}
