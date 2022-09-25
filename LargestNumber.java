package com.bridgelabz.basic_core_fun_prog;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        b = sc.nextInt();
        System.out.println("Enter Third Number: ");
        c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Largest number is: " + a);
        }
        if (b >= a && b >= c) {
            System.out.println("Largest number is:" + b);
        }
        if (c >= a && c >= b) {
            System.out.println("Largest number is: " + c);
        }
    }
}
