package org.mongobaba.refactory.chapter8;

/**
 * Replace Array with Object
 * 以对象取代数组
 */
public class Chapter8_5 {
    // TODO 创建一个类型，代替row数组
    static String[] createRow() {
        String[] row = new String[3];
        row[0] = "Liverpool";
        row[1] = "15";
        return row;
    }

    static String showRecord() {
        String[] row = createRow();
        String name = row[0];
        int wins = Integer.parseInt(row[1]);
        return name + " wins " + wins;
    }
}
