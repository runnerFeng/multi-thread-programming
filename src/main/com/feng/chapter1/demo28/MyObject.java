package com.feng.chapter1.demo28;

/**
 * @author jinx
 * @date 2018/1/3 11:33
 * Desc:
 */
public class MyObject {
    private String username = "1";
    private String password = "11";

    public void setValue(String username, String password) {
        this.username = username;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("停止a线程了！");
            Thread.currentThread().suspend();
        }
        this.password = password;
    }

    public void printUsernameAndPassword() {
        System.out.println(username + " " + password);
    }
}
