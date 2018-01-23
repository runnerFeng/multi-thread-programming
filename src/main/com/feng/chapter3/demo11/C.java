package com.feng.chapter3.demo11;

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
                if ("".equals(ValueObject.value)) {
                    string.wait();
                }
                System.out.println("get的value值是："+ValueObject.value);
                ValueObject.value = "";
                string.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
