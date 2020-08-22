package org.mongobaba.refactory.chapter10;

/**
 * Remove Parameter
 * 移除参数
 */
public class Chapter10_3 {
    // TODO 删除不用的areaCode参数
    static String getTelephoneNumber(int areaCode, int number) {
        return "Telephone: " + number;
    }
}
