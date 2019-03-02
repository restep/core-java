package com.restep.v1ch14.unsynchbank;

/**
 * @author restep
 * @date 2019/3/2
 */
public class UnsynchBank {
    public static void main(String[] args) {
        Bank bank = new Bank(100, 1000);
        for (int i = 0; i < 100; i++) {
            TransferRunnable runnable = new TransferRunnable(bank, i, 1000);
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
