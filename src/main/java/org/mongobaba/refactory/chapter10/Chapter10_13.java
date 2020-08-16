package org.mongobaba.refactory.chapter10;

import java.util.Vector;

/**
 * Encapsulate Downcast
 * 封装向下转型
 */
public class Chapter10_13 {
    static class Reading {
        private String name;

        public Reading(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    static class Site {
        private Vector<Object> readings = new Vector<>();

        void addReading(Reading reading) {
            readings.add(reading);
        }

        Object lastReading() {
            return readings.lastElement();
        }
    }

    static String getSiteLastReadingName(Site site) {
        Reading reading = (Reading) site.lastReading();
        return reading.getName();
    }
}
