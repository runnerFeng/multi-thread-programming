package com.feng.chapter3.demo29;

/**
 * @author jinx
 * @date 2018/1/30 15:57
 * Desc:
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return System.currentTimeMillis();
    }
}
