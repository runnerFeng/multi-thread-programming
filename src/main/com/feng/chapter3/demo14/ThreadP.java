package com.feng.chapter3.demo14;

/**
 * @author jinx
 * @date 2018/1/23 23:51
 * Desc:
 */
public class ThreadP extends Thread{
    private MyStack myStack;

    public ThreadP(MyStack myStack) {
        this.myStack = myStack;
    }

    @Override
    public void run() {
        while (true){
            myStack.push();
        }
    }
}
