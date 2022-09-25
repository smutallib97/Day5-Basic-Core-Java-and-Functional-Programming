package com.bridgelabz.basic_core_fun_prog;

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        x = sc.nextInt();
        System.out.println("Enter second number: ");
        y = sc.nextInt();
        System.out.println("Before Swapping: x = "+x+" y = "+y);
        swap(x, y);
    }
    public static void swap(int a, int b)
    {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping: x = "+a+" y = "+b);
    }

}
