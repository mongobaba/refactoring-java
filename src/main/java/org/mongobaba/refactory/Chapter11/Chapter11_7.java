package org.mongobaba.refactory.Chapter11;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Extract Superclass
 * 提炼超类
 */
public class Chapter11_7 {
    static class Employee {
        private String _name;
        private String _id;
        private int _annualCost;

        public Employee(String name, String id, int annualCost) {
            this._name = name;
            this._id = id;
            this._annualCost = annualCost;
        }

        public String getName() {
            return _name;
        }

        public String getId() {
            return _id;
        }

        public int getAnnualCost() {
            return _annualCost;
        }
    }

    static class Department {
        private String _name;
        private Vector<Object> _staff = new Vector<>();

        public Department(String name) {
            this._name = name;
        }

        public int getTotalAnnualCost() {
            Enumeration<Object> e = getStaff();
            int result = 0;
            while (e.hasMoreElements()) {
                Employee employee = (Employee) e.nextElement();
                result += employee.getAnnualCost();
            }
            return result;
        }

        public String getName() {
            return _name;
        }

        public int getHeadCount() {
            return _staff.size();
        }

        public Enumeration<Object> getStaff() {
            return _staff.elements();
        }

        public void addStaff(Employee employee) {
            _staff.add(employee);
        }
    }
}
