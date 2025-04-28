package com.reflection.methodexecutiontiming;

public class Sample {
    public void quickMethod() {
        System.out.println("Quick method executed.");
    }

    public void slowMethod() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Slow method executed.");
    }
}
