package org.mongobaba.refactory.Chapter11;

/**
 * Extract Subclass
 * 提炼子类
 */
public class Chapter11_6 {
    // TODO 从JobItem中抽取一个LaborItem类，专门处理按工时收费的情况；
    //      从JobItem中抽取一个PartsItem类，专门处理按零件收费的情况。
    static class JobItem {
        public JobItem(int unitPrice, int quantity, boolean isLabor, Employee employee) {
            _unitPrice = unitPrice;
            _quantity = quantity;
            _isLabor = isLabor;
            _employee = employee;
        }

        public int getTotalPrice() {
            return getUnitPrice() * _quantity;
        }

        public int getUnitPrice() {
            return _isLabor ? _employee.getRate() : _unitPrice;
        }

        public int getQuantity() {
            return _quantity;
        }

        public Employee getEmployee() {
            return _employee;
        }

        private int _unitPrice;
        private int _quantity;
        private boolean _isLabor;
        private Employee _employee;
    }

    static class Employee {
        private int _rate;

        public Employee(int rate) {
            this._rate = rate;
        }

        public int getRate() {
            return _rate;
        }
    }
}
