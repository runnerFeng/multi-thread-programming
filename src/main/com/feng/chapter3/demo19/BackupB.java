package com.feng.chapter3.demo19;

/**
 * @author jinx
 * @date 2018/1/29 17:58
 * Desc:
 */
public class BackupB extends Thread {
    private DBTools dbTools;

    public BackupB(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
