package com.feng.chapter3.demo19;

/**
 * @author jinx
 * @date 2018/1/29 17:57
 * Desc:
 */
public class BackupA extends Thread {
    private DBTools dbTools;

    public BackupA(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}
