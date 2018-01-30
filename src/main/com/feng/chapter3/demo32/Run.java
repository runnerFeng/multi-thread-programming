package com.feng.chapter3.demo32;

/**
 * @author jinx
 * @date 2018/1/30 16:49
 * Desc:ReentrantLock实现同步测试2
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.setName("a");
        threadA.start();
        ThreadAA threadAA = new ThreadAA(myService);
        threadAA.setName("aa");
        threadAA.start();

        Thread.sleep(100);

        ThreadB threadB = new ThreadB(myService);
        threadB.setName("b");
        threadB.start();
        ThreadBB threadBB = new ThreadBB(myService);
        threadBB.setName("bb");
        threadBB.start();

    }
}
