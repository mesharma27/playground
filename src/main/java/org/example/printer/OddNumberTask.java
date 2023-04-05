package org.example.printer;

import java.util.concurrent.Semaphore;

public class OddNumberTask implements Runnable {
    EvenOddPrinter printer;
    Semaphore flag;
    @Override
    public void run()  {
        System.out.println("Printing Odd number");
        printer.printOdd();

    }

    public OddNumberTask(EvenOddPrinter printer) {
        super();
        this.printer = printer;
    }
}