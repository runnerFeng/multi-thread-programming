package com.feng.chapter2.demo11;

/**
 * @author jinx
 * @date 2018/1/4 17:11
 * Desc:
 */
public class Service {
    private String username;
    private String password;
    private String anything = new String();

    public void setUsernameAndPassword(String username, String password) {
        try {
            synchronized (anything) {
                System.out.println("线程名为：" + Thread.currentThread().getName() + " 的线程在:" + System.currentTimeMillis() + "进入同步块了！");
                this.username = username;
                Thread.sleep(2000);
                System.out.println("线程名为：" + Thread.currentThread().getName() + " 的线程在:" + System.currentTimeMillis() + "离开同步块了！");
                this.password = password;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
