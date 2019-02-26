package com.restep.v1ch05;

/**
 * @author restep
 * @date 2019/2/26
 */
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int number = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        String abc = "a";
        System.out.println(abc);
    }
}
