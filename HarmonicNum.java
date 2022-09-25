package com.bridgelabz.basic_core_fun_prog;

import java.util.Scanner;

public class HarmonicNum {
    public static void main(String[] args) {

        System.out.println("Enter Number : ");
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        double result = 0.0;
        if (N != 0) {
            while (N > 0) {
                result = result + (double) 1 / N;
                N--;
            }
            System.out.println("Total Harmonic Series is " + result);
        } else
            System.out.println("Invalid Number");

    }
}
