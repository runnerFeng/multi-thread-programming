package com.feng.chapter3.demo19;

/**
 * @author jinx
 * @date 2018/1/29 17:59
 * Desc:等待通知交叉备份
 */
public class Run {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            BackupB backupB = new BackupB(dbTools);
            backupB.start();
            BackupA backupA = new BackupA(dbTools);
            backupA.start();
        }
    }
}
