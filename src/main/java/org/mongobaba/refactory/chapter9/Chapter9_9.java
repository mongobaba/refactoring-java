package org.mongobaba.refactory.chapter9;

/**
 * Introduce Assertion
 * 引入断言
 */
public class Chapter9_9 {
    static class Project {

        public double getMemberExpenseLimit() {
            return 10.0;
        }
    }

    static class Employee {
        private static final double NULL_EXPENSE = -1.0;
        private double _expenseLimit = NULL_EXPENSE;
        private Project _primaryProject;

        void setExpenseLimit(double limit) {
            _expenseLimit = limit;
        }

        void setPrimaryProject(Project project) {
            _primaryProject = project;
        }

        double getExpenseLimit() {
            // should have either expense limit or a primary project
            return (_expenseLimit != NULL_EXPENSE) ? _expenseLimit : _primaryProject.getMemberExpenseLimit();
        }

        boolean withinLimit(double expenseAmount) {
            return expenseAmount <= getExpenseLimit();
        }
    }
}
