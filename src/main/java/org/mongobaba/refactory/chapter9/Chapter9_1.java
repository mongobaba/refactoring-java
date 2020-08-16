package org.mongobaba.refactory.chapter9;

import org.mongobaba.refactory.DateUtil;

import java.util.Date;

/**
 * Decompose Conditional
 * 分解条件表达式
 */
public class Chapter9_1 {
    private static final Date SUMMER_START = DateUtil.at(2020, 4, 1);
    private static final Date SUMMER_END = DateUtil.at(2020, 10, 1);
    private double _winterRate = 0.1;
    private double _winterServiceCharge = 0.3;
    private double _summerRate = 0.15;

    double calculateCharge(Date data, double quantity) {
        double charge;
        if (data.before(SUMMER_START) || data.after(SUMMER_END)) {
            charge = quantity * _winterRate + _winterServiceCharge;
        } else {
            charge = quantity * _summerRate;
        }
        return charge;
    }
}
