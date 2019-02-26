package com.restep.v1ch03;

import java.util.Scanner;

/**
 * @author restep
 * @date 2019/2/23
 */
public class LotteryOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("需要抽取多少个数字: ");
        int total = scanner.nextInt();

        System.out.print("抽取的最高数字: ");
        int max = scanner.nextInt();

        int lotteryOdds = 1;
        for (int i = 1; i <= total; i++) {
            lotteryOdds = lotteryOdds * (max - i + 1) / i;
        }

        System.out.println("概率是: " + lotteryOdds + "分之一");
    }
}
