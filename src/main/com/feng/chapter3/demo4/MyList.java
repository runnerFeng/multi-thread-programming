package com.feng.chapter3.demo4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinx
 * @date 2018/1/16 21:44
 * Desc:
 */
public class MyList {
    private static List list = new ArrayList<>();

    public static void add() {
        list.add("高红艳");
    }

    public static int getSize() {
        return list.size();
    }
}
