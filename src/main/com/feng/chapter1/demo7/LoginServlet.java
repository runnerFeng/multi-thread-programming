package com.feng.chapter1.demo7;


/**
 * @author jinx
 * @date 2017/12/27 22:26
 * Desc:
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;

    //非线程安全
//    public static void doPost(String username, String password) {
//        try {
//            usernameRef = username;
//
//            if ("a".equals("a")) {
//                Thread.sleep(500);
//            }
//            passwordRef = password;
//            System.out.println("username="+usernameRef+" password="+passwordRef);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    //线程安全
    synchronized public static void doPost(String username, String password) {
        try {
            usernameRef = username;

            if ("a".equals("a")) {
                Thread.sleep(500);
            }
            passwordRef = password;
            System.out.println("username=" + usernameRef + " password=" + passwordRef);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
