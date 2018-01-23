package com.feng.chapter3.demo11;

/**
 * @author jinx
 * @date 2018/1/23 21:39
 * Desc:
 */
public class P {
    private String string;

    public P(String string) {
        this.string = string;
    }

    public void setValue() {
        try {
            synchronized (string) {
                if (!"".equals(ValueObject.value)) {
                    string.wait();
                }
                String value = System.currentTimeMillis()+"_"+System.nanoTime();
                System.out.println("set的值是："+value);
                ValueObject.value = value;
                string.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
