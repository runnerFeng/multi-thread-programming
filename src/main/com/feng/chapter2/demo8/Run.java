package com.feng.chapter2.demo8;

/**
 * @author jinx
 * @date 2018/1/4 15:10
 * Desc:出现异常，锁自动释放
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA threadA = new ThreadA(service);
            threadA.setName("a");
            threadA.start();
            Thread.sleep(200);
            ThreadB threadB = new ThreadB(service);
            threadB.setName("b");
            threadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
