package com.feng.chapter2.demo9;

/**
 * @author jinx
 * @date 2018/1/4 15:57
 * Desc:
 */
public class Sub extends Main {
    @Override
//      public void serviceMethod(){
    synchronized public void serviceMethod() {
        try {
            System.out.println("threadName:" + Thread.currentThread().getName() + " begin:" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("threadName:" + Thread.currentThread().getName() + " end:" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
