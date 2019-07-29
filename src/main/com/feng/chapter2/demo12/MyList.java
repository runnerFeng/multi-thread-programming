package com.feng.chapter2.demo12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinx
 * @date 2018/1/4 21:44
 * Desc:
 */
public class MyList {
    private List list = new ArrayList<>();

    synchronized public void add(String username) {
        System.out.println("threadName:" + Thread.currentThread().getName() + "执行了add方法！");
        list.add(username);
        System.out.println("threadName:" + Thread.currentThread().getName() + "退出了add方法！");
    }

    synchronized public int getSize() {
        System.out.println("threadName:" + Thread.currentThread().getName() + "执行了getSize方法！");
        int size = list.size();
        System.out.println("threadName:" + Thread.currentThread().getName() + "退出了getSize方法！");
        return size;
    }
}
