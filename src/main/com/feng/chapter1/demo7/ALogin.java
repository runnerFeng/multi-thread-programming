package com.feng.chapter1.demo7;

/**
 * @author jinx
 * @date 2017/12/27 22:33
 * Desc:
 */
public class ALogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a","aa");
    }
}
