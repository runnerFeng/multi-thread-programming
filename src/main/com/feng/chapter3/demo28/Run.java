package com.feng.chapter3.demo28;

/**
 * @author jinx
 * @date 2018/1/30 15:40
 * Desc:解决get方法返回null问题
 */
public class Run {
    public static ThreadLocalExt t = new ThreadLocalExt();

    public static void main(String[] args) {
        if (null == t.get()) {
            t.set("我没有默认值");
        }
        System.out.println(t.get());
    }
}
