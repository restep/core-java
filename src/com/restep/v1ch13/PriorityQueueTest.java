package com.restep.v1ch13;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.PriorityQueue;

/**
 * @author restep
 * @date 2019/2/28
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<GregorianCalendar> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new GregorianCalendar(1906, Calendar.DECEMBER, 9));
        priorityQueue.add(new GregorianCalendar(1815, Calendar.DECEMBER, 10));
        priorityQueue.add(new GregorianCalendar(1903, Calendar.DECEMBER, 3));
        priorityQueue.add(new GregorianCalendar(1910, Calendar.JUNE, 22));

        for (GregorianCalendar date : priorityQueue) {
            System.out.println(date.get(Calendar.YEAR));
        }

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove().get(Calendar.YEAR));
        }
    }
}
