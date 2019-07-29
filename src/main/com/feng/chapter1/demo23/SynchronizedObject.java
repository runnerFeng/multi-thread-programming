package com.feng.chapter1.demo23;

/**
 * @author jinx
 * @date 2018/1/2 22:24
 * Desc:
 */
public class SynchronizedObject {
    private String username = "a";
    private String password = "aa";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    synchronized public void printString(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(1000);
            this.password = password;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
