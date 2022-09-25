package com.bridgelabz.basic_core_fun_prog;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int f = factor(N);
        System.out.println(f);
    }

    public static int factor(int N) {
        if (N == 1) {
            return 1;
        }
        int fnm1 = factor(N - 1);
        int fn = N * fnm1;
        return fn;
    }

}
