package com.feng.chapter2.demo27;

/**
 * @author jinx
 * @date 2018/1/12 22:29
 * Desc:同步死循环问题
 */
public class Run {
    public static void main(String[] args) {
        PrintString printString = new PrintString();
        new Thread(printString).start();
        System.out.println("stop printStringMethod:"+Thread.currentThread().getName());
        printString.setContinuePrintString(false);
    }
}
