package org.mongobaba.refactory.chapter9;

/**
 * Remove Control Flag
 * 移除控制标记
 */
public class Chapter9_4 {
    void checkSecurity(String[] people) {
        boolean found = false;
        for (int i = 0; i < people.length; i++) {
            if (!found) {
                if (people[i].equals("Don")) {
                    sendAlert();
                    found = true;
                } else if (people[i].equals("John")) {
                    sendAlert();
                    found = true;
                }
            }
        }
    }

    void checkSecurityAndUse(String[] people) {
        String found = "";
        for (int i = 0; i < people.length; i++) {
            if (found.equals("")) {
                if (people[i].equals("Don")) {
                    sendAlert();
                    found = people[i];
                } else if (people[i].equals("John")) {
                    sendAlert();
                    found = people[i];
                }
            }
        }
        someLaterCode(found);
    }

    private void someLaterCode(String found) {
    }

    private void sendAlert() {
        System.out.print("alert");
    }
}
