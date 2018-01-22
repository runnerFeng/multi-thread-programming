package com.feng.chapter3.demo10;

/**
 * @author jinx
 * @date 2018/1/22 23:35
 * Desc:
 */
public class Subtract {
    private String string;

    public Subtract(String string) {
        this.string = string;
    }

    public void subtract() {
        try {
            synchronized (string) {
//                if (ValueObject.list.size() == 0) {
                while (ValueObject.list.size() == 0) {
                    System.out.println(Thread.currentThread().getName() + " wait begin");
                    string.wait();
                    System.out.println(Thread.currentThread().getName() + " wait end");
                }
                ValueObject.list.remove(0);
                System.out.println("list size:" + ValueObject.list.size());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
