package com.feng.chapter3.demo1;

/**
 * @author jinx
 * @date 2018/1/16 21:52
 * Desc:等待/通信机制；该例中两个线程当threadA执行到i==5时，如果正好此时线程执行器没让threadB执行自己的代码，那么threadB就再机会执行自己的代码了。
 *
 */
public class Run {
    public static void main(String[] args) {
        MyList myList = new MyList();
        ThreadA threadA = new ThreadA(myList);
        threadA.start();
        ThreadB threadB = new ThreadB(myList);
        threadB.start();
    }
}
