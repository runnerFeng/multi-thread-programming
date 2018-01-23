package com.feng.chapter3.demo13;

/**
 * @author jinx
 * @date 2018/1/23 23:54
 * Desc:生产者消费者模式：一个生产者一个消费者 操作栈 一般不会造成假死但是释放锁使用notifyAll比较安全些。
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack  = new MyStack();
        ThreadP threadP = new ThreadP(myStack);
        threadP.start();
        ThreadC threadC = new ThreadC(myStack);
        threadC.start();
    }
}
