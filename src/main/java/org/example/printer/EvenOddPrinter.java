package org.example.printer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class EvenOddPrinter {
    private volatile boolean evenFlag ;
    Integer i = 1;

    public void printEven() {
        synchronized (this) {

            while (i <= 10) {

                while (!evenFlag) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName()+": "+i);
                i++;
                evenFlag = false;
                notify();
            }
        }
    }

    public void printOdd() {
        synchronized (this) {

            while (i <= 10) {

                while (evenFlag) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName()+": "+i);
                i++;
                evenFlag = true;
                notify();
            }
        }
    }

    /*public static void print() {
        EvenOddPrinter evenOddPrinter = new EvenOddPrinter();
        OddNumberTask odd = new OddNumberTask(evenOddPrinter);
        EvenNumberTask even = new EvenNumberTask(evenOddPrinter);
        ExecutorService exc = Executors.newFixedThreadPool(2);
        try {
            exc.execute(odd);
            exc.execute(even);
            exc.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {

        } finally {
            exc.shutdownNow();
        }

    }*/
}
