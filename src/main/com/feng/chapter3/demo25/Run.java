package com.feng.chapter3.demo25;

/**
 * @author jinx
 * @date 2018/1/30 14:37
 * Desc:ThreadLocal新征程
 */
public class Run {
    public static ThreadLocal threadLocal = new ThreadLocal();

    public static void main(String[] args) {
        if (null == threadLocal.get()) {
            System.out.println("从未放过值");
            threadLocal.set("我的值");
        }
        System.out.println(threadLocal.get());
    }
}
