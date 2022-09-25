package com.bridgelabz.basic_core_fun_prog;

import java.util.Scanner;

public class Quotient_Reminder {
    public static void main(String[] args) {
        int dividend = 0, divisor = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Dividend value: ");
        dividend = sc.nextInt();

        System.out.println("Enter Divisor value: ");
        divisor = sc.nextInt();


        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Reminder = " + remainder);;
    }
}
