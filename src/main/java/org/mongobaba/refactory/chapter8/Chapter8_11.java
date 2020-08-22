package org.mongobaba.refactory.chapter8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Encapsulate Collection
 * 封装集合
 */
public class Chapter8_11 {
    static class Course {
        public Course(String name, boolean isAdvanced) {
            this._name = name;
            this._isAdvanced = isAdvanced;
        }

        public boolean isIsAdvanced() {
            return _isAdvanced;
        }

        private String _name;
        private boolean _isAdvanced;
    }

    // TODO 删除集合的get和set方法
    static class Person {
        public Set<Object> getCourses() {
            return _courses;
        }

        public void setCourses(Set<Object> arg) {
            this._courses = arg;
        }

        private Set<Object> _courses;
    }

    static Person kent() {
        Person kent = new Person();
        Set<Object> s = new HashSet<>();
        s.add(new Course("Smalltalk Programming", false));
        s.add(new Course("Appreciating Single Malts", true));
        kent.setCourses(s);
        Course refactoring = new Course("Refactoring", true);
        kent.getCourses().add(refactoring);
        kent.getCourses().add(new Course("Brutal Sarcasm", false));
        kent.getCourses().remove(refactoring);
        return kent;
    }

    // TODO 将此方法的主体转移到Person类中
    static int numberOfAdvancedCourses(Person person) {
        Iterator<Object> iter = person.getCourses().iterator();
        int count = 0;
        while (iter.hasNext()) {
            Course course = (Course) iter.next();
            if (course.isIsAdvanced()) {
                count++;
            }
        }
        return count;
    }
}
