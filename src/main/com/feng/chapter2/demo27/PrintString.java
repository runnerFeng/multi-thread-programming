package com.feng.chapter2.demo27;

/**
 * @author jinx
 * @date 2018/1/12 22:27
 * Desc:
 */
public class PrintString implements Runnable {
    private boolean isContinuePrintString = true;

    public void printStringMethod() {
        while (isContinuePrintString == true) {
            System.out.println("run printStringMethod threadName:" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isContinuePrintString() {
        return isContinuePrintString;
    }

    public void setContinuePrintString(boolean continuePrintString) {
        isContinuePrintString = continuePrintString;
    }

    @Override
    public void run() {
        this.printStringMethod();
    }
}
