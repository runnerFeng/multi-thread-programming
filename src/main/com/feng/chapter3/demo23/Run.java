package com.feng.chapter3.demo23;

/**
 * @author jinx
 * @date 2018/1/30 10:43
 * Desc:验证join(long)释放锁
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        ThreadB threadB = new ThreadB();
        ThreadA threadA = new ThreadA(threadB);
        threadA.start();

        ThreadC threadC = new ThreadC(threadB);
        threadC.start();
    }
}
