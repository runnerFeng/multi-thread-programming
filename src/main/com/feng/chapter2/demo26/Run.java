package com.feng.chapter2.demo26;

/**
 * @author jinx
 * @date 2018/1/12 22:29
 * Desc:同步死循环问题，注意此时两个类中获取的线程都是main线程
 */
public class Run {
    public static void main(String[] args) {
        PrintString printString = new PrintString();
        printString.printStringMethod();
        System.out.println("stop printStringMethod:"+Thread.currentThread().getName());
        printString.setContinuePrintString(false);
    }
}
