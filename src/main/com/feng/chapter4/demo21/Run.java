package com.feng.chapter4.demo21;

/**
 * @author jinx
 * @date 2018/03/27 21:02
 * Desc: boolean tryLock()仅在调用时锁未被另一个线程保持的情况下获得该锁
 */
public class Run {
    public static void main(String[] args) {
        final  MyService service = new MyService();
        Runnable runnable = service::waitMethod;

        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
    }
}
