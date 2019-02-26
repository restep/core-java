package com.restep.v1ch03;

import java.util.Scanner;

/**
 * @author restep
 * @date 2019/2/23
 */
public class Retirement2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("现在每年能赚多少: ");
        double payment = scanner.nextDouble();

        System.out.print("利率: ");
        double interestRate = scanner.nextDouble();

        double balance = 0;
        int year = 0;
        String input = null;

        do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;

            year++;

            System.out.printf("%d年之后 收入是%,.2f%n", year, balance);

            System.out.print("是否退休(Y/N): ");
            input = scanner.next();
        } while ("N".equals(input));
    }
}
