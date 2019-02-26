package com.restep.v1ch03;

import java.util.Scanner;

/**
 * @author restep
 * @date 2019/2/23
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("你的名字: ");
        String name = scanner.nextLine();

        System.out.print("你的年龄: ");
        int age = scanner.nextInt();

        System.out.println(name + " 下一年你" + ++age + "岁了");
    }
}
