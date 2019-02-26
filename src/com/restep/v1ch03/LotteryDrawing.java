package com.restep.v1ch03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author restep
 * @date 2019/2/23
 */
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("需要抽取多少个数字: ");
        int total = scanner.nextInt();

        System.out.print("抽取的最高数字: ");
        int max = scanner.nextInt();

        int[] numbers = new int[max];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int[] result = new int[total];
        for (int i = 0; i < result.length; i++) {
            int random = (int) (Math.random() * max);

            result[i] = numbers[random];

            numbers[random] = numbers[max - 1];

            max--;
        }

        Arrays.sort(result);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
