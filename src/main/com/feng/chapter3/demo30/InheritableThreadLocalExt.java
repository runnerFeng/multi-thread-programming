package com.feng.chapter3.demo30;

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

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue+"我在子线程加的";
    }
}
