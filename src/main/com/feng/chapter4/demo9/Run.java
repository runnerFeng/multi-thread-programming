package com.feng.chapter4.demo9;

/**
 * @author jinx
 * @date 2018/02/05 21:50
 * Desc:生产者/消费模式 多对多交替打印,使用signal()程序会出现假死现象
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThreadA[] threadA = new MyThreadA[10];
        MyThreadB[] threadB = new MyThreadB[10];
        for (int i = 0; i < 10; i++) {
            threadA[i] = new MyThreadA(myService);
            threadA[i].start();
            threadB[i] = new MyThreadB(myService);
            threadB[i].start();
        }
    }
}
