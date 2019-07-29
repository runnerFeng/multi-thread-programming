package com.feng.chapter3.demo16;

/**
 * @author jinx
 * @date 2018/1/23 23:53
 * Desc:
 */
public class ThreadC extends Thread {
    private MyStack myStack;

    public ThreadC(MyStack myStack) {
        this.myStack = myStack;
    }

    @Override
    public void run() {
        while (true) {
            myStack.pop();
        }
    }
}
