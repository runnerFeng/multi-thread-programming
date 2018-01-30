package com.feng.chapter3.demo28;

/**
 * @author jinx
 * @date 2018/1/30 15:39
 * Desc:
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "我是默认值";
    }
}
