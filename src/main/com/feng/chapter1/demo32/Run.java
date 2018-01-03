package com.feng.chapter1.demo32;

/**
 * @author jinx
 * @date 2018/1/3 16:28
 * Desc:测试看谁运行的次数多
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA threadA = new ThreadA();
            threadA.setPriority(Thread.NORM_PRIORITY-3);
            threadA.start();
            ThreadB threadB = new ThreadB();
            threadB.setPriority(Thread.NORM_PRIORITY+3);
            threadB.start();
            Thread.sleep(2000);
            threadA.stop();
            threadB.stop();
            System.out.println(threadA.getCount());
            System.out.println(threadB.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
