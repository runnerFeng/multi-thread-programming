package com.feng.chapter3.demo12;

/**
 * @author jinx
 * @date 2018/1/23 21:45
 * Desc:
 */
public class C {
    private String string;

    public C(String string) {
        this.string = string;
    }

    public void getValue() {
        try {
            synchronized (string) {
                while ("".equals(ValueObject.value)) {
                    System.out.println("消费者 " + Thread.currentThread().getName() + " wait了@@@@@@@@@@@");
                    string.wait();
                }
                System.out.println("消费者 " + Thread.currentThread().getName() + " running了$$$$$$$$$$");
                System.out.println("消费者 " + Thread.currentThread().getName() + " get的value值是：" + ValueObject.value);
                ValueObject.value = "";
                string.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
