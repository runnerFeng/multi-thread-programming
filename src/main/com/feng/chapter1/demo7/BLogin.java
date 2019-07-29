package com.feng.chapter1.demo7;

/**
 * @author jinx
 * @date 2017/12/27 22:34
 * Desc:
 */
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}
