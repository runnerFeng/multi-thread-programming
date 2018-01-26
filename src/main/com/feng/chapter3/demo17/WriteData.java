package com.feng.chapter3.demo17;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @author jinx
 * @date 2018/1/26 11:38
 * Desc:
 */
public class WriteData {
    public void writeMethod(PipedOutputStream out){
        try {
            System.out.println("write:");
            for (int i = 0; i < 300; i++) {
                String outData = (i+1)+"";
                out.write(outData.getBytes());
                System.out.println(outData);
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
