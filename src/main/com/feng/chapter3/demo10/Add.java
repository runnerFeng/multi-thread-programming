package com.feng.chapter3.demo10;

/**
 * @author jinx
 * @date 2018/1/22 23:32
 * Desc:
 */
public class Add {
    private String string;

    public Add(String string) {
        this.string = string;
    }

    public void add() {
        synchronized (string) {
            ValueObject.list.add("anything");
            string.notifyAll();
        }
    }
}
