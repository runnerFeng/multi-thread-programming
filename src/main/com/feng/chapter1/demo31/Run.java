package com.feng.chapter1.demo31;

/**
 * @author jinx
 * @date 2018/1/3 15:47
 * Desc:优先级具有规则性,优先级高的先运行；优先级具有随机性，优先级高的不一定每一次都先运行，所以不能把线程的优先级和运行结果的顺序作为衡量的标准
 */
public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            MyThread1 thread1 = new MyThread1();
            thread1.setPriority(5);
            thread1.start();
            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(6);
            thread2.start();
        }
    }
}