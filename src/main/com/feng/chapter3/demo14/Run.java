package com.feng.chapter3.demo14;

/**
 * @author jinx
 * @date 2018/1/23 23:54
 * Desc:生产者消费者模式：一个生产者多个消费者 操作栈 解决wait条件改变与假死。
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack  = new MyStack();
        ThreadP threadP = new ThreadP(myStack);
        threadP.start();
        ThreadC threadC = new ThreadC(myStack);
        ThreadC threadC2 = new ThreadC(myStack);
        ThreadC threadC3 = new ThreadC(myStack);
        ThreadC threadC4 = new ThreadC(myStack);
        ThreadC threadC5 = new ThreadC(myStack);
        threadC.start();
        threadC2.start();
        threadC3.start();
        threadC4.start();
        threadC5.start();
    }
}
