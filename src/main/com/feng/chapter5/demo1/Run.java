package com.feng.chapter5.demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author jinx
 * @date 2018/03/29 21:51
 * Desc:在未来执行的效果
 */
public class Run {
    //非守护线程创建方式
//    private static Timer timer = new Timer();
    private static Timer timer = new Timer(true);

    //守护线程创建方式(守护线程守护着最后一个用户线程，当最后一个用户线程执行完了，他自己也就退出了，所以该模式下，run方法中的语句不执行)
    public static class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了!时间为：" + new Date());
        }
    }

    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2018-3-29 22:11:00";
            System.out.println("字符串时间：" + dateString + " 当前时间：" + new Date());
            Date date = sdf.parse(dateString);
            //如果指定时间小于当前时间则程序等到了指定时间任务执行，如果当前时间大于等于当前时间则程序立刻执行
            timer.schedule(myTask, date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
