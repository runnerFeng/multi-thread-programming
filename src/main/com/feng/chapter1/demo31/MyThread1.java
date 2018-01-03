package com.feng.chapter1.demo31;

/**
 * @author jinx
 * @date 2018/1/3 15:37
 * Desc:
 */
public class MyThread1 extends Thread{
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long result = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 500000; j++) {
            result = result+i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("thread1 use time:"+(endTime-beginTime));
    }
    
    
}
