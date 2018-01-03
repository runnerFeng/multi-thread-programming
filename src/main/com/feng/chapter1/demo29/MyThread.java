package com.feng.chapter1.demo29;

/**
 * @author jinx
 * @date 2018/1/3 14:13
 * Desc:yield()方法的作用是放弃当前cpu资源，将他让给其他的任务去占用cpu执行时间。
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 5000000; i++) {
//            Thread.yield();
            count = count + i + 1;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时："+(endTime - beginTime));
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
