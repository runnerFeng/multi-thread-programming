package com.feng.chapter3.demo15;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinx
 * @date 2018/1/23 23:41
 * Desc:
 */
public class MyStack {
    private List list = new ArrayList<>();

    synchronized public void push() {
        try {
            if (list.size() == 1) {
                this.wait();
            }
            list.add("anything" + Math.random());
            this.notify();
            System.out.println("push:" + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public String pop() {
        String returnValue = "";
        try {
            if (list.size() == 0) {
                this.wait();
            }
            returnValue = list.get(0) + "";
            list.remove(0);
            this.notify();
            System.out.println("pop:" + returnValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
