package com.feng.test.demo1;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author jinx
 * @date 2018/4/2 10:56
 * Desc:
 */
public class Reminder {
    private static Timer timer;

    public Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
    }

    static class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Time's up!");
            timer.cancel(); //Terminate the timer thread
        }
    }

    public static void main(String args[]) {
//        System.out.println("About to schedule task.");
//        new Reminder(5);
//        System.out.println("Task scheduled.");


//        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.HOUR_OF_DAY, 23);
//        calendar.set(Calendar.MINUTE, 1);
//        calendar.set(Calendar.SECOND, 0);
//        Date time = calendar.getTime();
//
//        timer = new Timer();
//        timer.schedule(new RemindTask(), time);

    }
}
