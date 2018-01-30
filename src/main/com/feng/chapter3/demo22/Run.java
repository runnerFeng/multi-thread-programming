package com.feng.chapter3.demo22;

/**
 * @author jinx
 * @date 2018/1/30 10:43
 * Desc:验证sleep(long)不释放锁
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
