package com.restep.v1ch03;

import java.util.Scanner;

/**
 * @author restep
 * @date 2019/2/23
 */
public class Retirement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("赚够多少钱就退休: ");
        double goal = scanner.nextDouble();

        System.out.print("现在每年能赚多少: ");
        double payment = scanner.nextDouble();

        System.out.print("利率: ");
        double interestRate = scanner.nextDouble();

        double balance = 0;
        int year = 0;

        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            year++;
        }

        System.out.println("多少年后可以退休: " + year);
    }
}
