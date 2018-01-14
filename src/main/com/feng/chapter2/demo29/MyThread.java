package com.feng.chapter2.demo29;

/**
 * @author jinx
 * @date 2018/1/14 21:54
 * Desc:
 */
public class MyThread extends Thread {
    volatile public static int count;

    private static void addCount() {
        for (int i = 0; i < 100; i++) {
            //该操作是线程非安全的，分三步：1.内存中取出count的值；2.给count赋值；3.把值存到内存中去
            count++;
        }
        System.out.println("threadName:" + Thread.currentThread().getName() + " count:" + count);
    }

    @Override
    public void run() {
        addCount();
    }
}
