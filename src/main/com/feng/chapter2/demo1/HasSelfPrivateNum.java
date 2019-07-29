package com.feng.chapter2.demo1;

/**
 * @author jinx
 * @date 2018/1/3 18:13
 * Desc:
 */
public class HasSelfPrivateNum {
    public void addI(String username) {
        try {
            int num = 0;
            if ("a".equals(username)) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println("username:" + username + "num" + num);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
