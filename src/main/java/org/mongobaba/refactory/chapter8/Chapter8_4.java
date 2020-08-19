package org.mongobaba.refactory.chapter8;

/**
 * Change Reference to Value
 * 将引用对象改为值对象
 */
public class Chapter8_4 {
    static class Currency {
        private String _code;

        public Currency(String code) {
            this._code = code;
        }

        public String getCode() {
            return _code;
        }
    }
}
