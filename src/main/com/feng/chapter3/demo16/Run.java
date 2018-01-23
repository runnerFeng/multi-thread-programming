package com.feng.chapter3.demo16;

/**
 * @author jinx
 * @date 2018/1/23 23:54
 * Desc:生产者消费者模式：多个生产者多个消费者 操作栈 一般不会造成假死但是释放锁时使用notifyAll比较安全些。
 *     总结：生产者消费者模式中释放锁时尽量使用notifyAll来释放所有的锁避免假死现象。
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
