package com.feng.chapter1.demo14;

/**
 * @author jinx
 * @date 2018/1/2 11:41
 * Desc:getId()方法
 */
public class Test {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "-----" + thread.getId());
    }
}
