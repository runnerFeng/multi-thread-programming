package com.feng.chapter3.demo15;

/**
 * @author jinx
 * @date 2018/1/23 23:54
 * Desc:生产者消费者模式：多个生产者一个消费者 操作栈 一般不会造成假死,但是释放锁时还是使用notifyAll比较安全些。
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack  = new MyStack();
        ThreadP threadP = new ThreadP(myStack);
        ThreadP threadP2 = new ThreadP(myStack);
        ThreadP threadP3 = new ThreadP(myStack);
        ThreadP threadP4 = new ThreadP(myStack);
        ThreadP threadP5 = new ThreadP(myStack);
        threadP.start();
        threadP2.start();
        threadP3.start();
        threadP4.start();
        threadP5.start();
        ThreadC threadC = new ThreadC(myStack);
        threadC.start();

    }
}
