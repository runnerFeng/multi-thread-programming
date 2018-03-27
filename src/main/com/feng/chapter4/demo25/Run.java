package com.feng.chapter4.demo25;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jinx
 * @date 2018/03/27 23:07
 * Desc:condition实现顺序打印
 */
public class Run {
    volatile public static int nextPrintWho = 1;
    private static ReentrantLock lock = new ReentrantLock();
    private static final Condition conditionA = lock.newCondition();
    private static final Condition conditionB = lock.newCondition();
    private static final Condition conditionC = lock.newCondition();
    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            try {
                lock.lock();
                while (nextPrintWho !=1){
                    conditionA.await();
                }
                for (int i = 0; i < 3; i++) {
                    System.out.println("conditionA"+i);
                }
                conditionB.signalAll();
                nextPrintWho = 2;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        Thread threadB = new Thread(() -> {
            try {
                lock.lock();
                while (nextPrintWho !=2){
                    conditionB.await();
                }
                for (int i = 0; i < 3; i++) {
                    System.out.println("conditionB"+i);
                }
                conditionC.signalAll();
                nextPrintWho = 3;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        Thread threadC = new Thread(() -> {
            try {
                lock.lock();
                while (nextPrintWho !=3){
                    conditionC.await();
                }
                for (int i = 0; i < 3; i++) {
                    System.out.println("conditionC"+i);
                }
                conditionA.signalAll();
                nextPrintWho = 1;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });


        Thread[] threadsA = new Thread[5];
        Thread[] threadsB = new Thread[5];
        Thread[] threadsC = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threadsA[i] = new Thread(threadA);
            threadsB[i] = new Thread(threadB);
            threadsC[i] = new Thread(threadC);

            threadsA[i].start();
            threadsB[i].start();
            threadsC[i].start();
        }
    }
}
