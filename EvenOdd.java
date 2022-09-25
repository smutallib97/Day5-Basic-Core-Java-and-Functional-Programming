package com.bridgelabz.basic_core_fun_prog;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Entered Number is Even");
        } else {
            System.out.println("Entered Number is Odd");
        }
    }
}
