package com.feng.chapter3.demo2;

/**
 * @author jinx
 * @date 2018/1/17 21:15
 * Desc:
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            String string = new String();
            string.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
