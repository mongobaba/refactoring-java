package org.mongobaba.refactory.chapter8;

/**
 * Replace Magic Number with Symbolic Constant
 * 以字面常量取代魔法数
 */
public class Chapter8_9 {
    double potentialEnergy(double mass, double height) {
        return mass * 9.81 * height;
    }
}
