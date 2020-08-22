package org.mongobaba.refactory.Chapter6;

/**
 * Substitute Algorithm
 * 替换算法
 */
public class Chapter6_9 {
    // TODO 采用新的查找算法，避免对人名进行显式的逐一判断
    static String foundPerson(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                return "Don";
            }
            if (people[i].equals("John")) {
                return "John";
            }
            if (people[i].equals("Kent")) {
                return "Kent";
            }
        }
        return "";
    }
}
