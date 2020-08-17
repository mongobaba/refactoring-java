package org.mongobaba.refactory.Chapter6;

/**
 * Split Temporary Variable
 * 分解临时变量
 */
public class Chapter6_6 {
    private double _primaryForce;
    private double _secondaryForce;
    private double _mass;
    private int _delay;

    public Chapter6_6(double primaryForce, double secondaryForce, double mass, int delay) {
        this._primaryForce = primaryForce;
        this._secondaryForce = secondaryForce;
        this._mass = mass;
        this._delay = delay;
    }

    double getDistanceTravelled(int time) {
        double result;
        double acc = _primaryForce / _mass;
        int primaryTime = Math.min(time, _delay);
        result = 0.5 * acc * primaryTime * primaryTime;
        int secondaryTime = time - _delay;
        if (secondaryTime > 0) {
            double primaryVel = acc * _delay;
            acc = (_primaryForce + _secondaryForce) / _mass;
            result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
        }
        return result;
    }
}
