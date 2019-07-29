package com.feng.chapter2.demo32;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author jinx
 * @date 2018/1/14 22:51
 * Desc:
 */
public class MyService {
    public static AtomicLong atomicLong = new AtomicLong();

    //    public void addNum(){
    synchronized public void addNum() {
        System.out.println("atomicLong加了100之后的值是：" + atomicLong.addAndGet(100));
        atomicLong.addAndGet(1);
    }
}
