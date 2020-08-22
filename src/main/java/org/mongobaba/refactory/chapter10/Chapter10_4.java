package org.mongobaba.refactory.chapter10;

/**
 * Separate Query from Modifier
 * 将查询函数和修改函数分离
 */
public class Chapter10_4 {
    // TODO 将sendAlert从当前方法中拆分出来
    String foundMiscreant(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
                return "Don";
            }
            if (people[i].equals("John")) {
                sendAlert();
                return "John";
            }
        }
        return "";
    }

    private void sendAlert() {
        System.out.print("alert");
    }

    void checkSecurity(String[] people) {
        String found = foundMiscreant(people);
        someLaterCode(found);
    }

    private void someLaterCode(String found) {
    }
}
