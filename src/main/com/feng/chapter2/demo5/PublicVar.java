package com.feng.chapter2.demo5;

/**
 * @author jinx
 * @date 2018/1/4 11:28
 * Desc:
 */
public class PublicVar {
    private String username = "A";
    private String password = "AA";

    synchronized public void setValue(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method -->username:" + username + " password:" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    public void getValue(){
    synchronized public void getValue(){
        System.out.println("getValue method -->username:"+username+" password:"+password);
    }
}
