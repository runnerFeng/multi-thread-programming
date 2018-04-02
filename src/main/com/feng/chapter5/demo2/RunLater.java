package com.feng.chapter5.demo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author jinx
 * @date 2018/03/29 22:45
 * Desc:多任务及延时测试
 */
public class RunLater {
    private static Timer timer = new Timer();

    public static class MyTask1 extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("task1 begin:" + new Date());
                Thread.sleep(10000);
                System.out.println("task1 end:" + new Date());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class MyTask2 extends TimerTask {
        @Override
        public void run() {
            System.out.println("task2 begin:" + new Date());
            System.out.println("task2 end:" + new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask1 myTask1 = new MyTask1();
            MyTask2 myTask2 = new MyTask2();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String stringDate1 = "2018-3-29 22:53:00";
            String stringDate2 = "2018-3-29 22:53:00";
            Date date1 = sdf1.parse(stringDate1);
            Date date2 = sdf2.parse(stringDate2);
            timer.schedule(myTask1, date1);
            timer.schedule(myTask2, date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
