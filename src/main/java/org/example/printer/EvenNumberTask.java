package org.example.printer;

public class EvenNumberTask implements Runnable{
    EvenOddPrinter evenOddPrinter;
    public void run() {
        System.out.println("Printing Even number");
        evenOddPrinter.printEven();
    }

    public EvenNumberTask(EvenOddPrinter evenOddPrinter) {
        super();
        this.evenOddPrinter = evenOddPrinter;
    }
}
