package org.mongobaba.refactory.chapter8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.chapter8.Chapter8_6.*;

class Chapter8_6Test {
    private IntervalWindow window;

    @BeforeEach
    void initWindow() {
        window = new IntervalWindow();
    }

    /**
     * TODO 在重构过程中需要将下面对TextField的直接设置改为
     * window.setStart("8")这样的形式。
     * 相反，取值部分不需要更改，以便验证UI数据确实是符合期望的。
     */

    @Test
    void startFieldLostFocus() {
        window.focusStart();
        window.getStartField().setText("8");
        window.getEndField().setText("20");
        window.focusEnd(); // start lost focus
        assertEquals("12", window.getLengthField().getText());
    }

    @Test
    void endFieldLostFocus() {
        window.focusEnd();
        window.getStartField().setText("8");
        window.getEndField().setText("20");
        window.focusStart(); // end lost focus
        assertEquals("12", window.getLengthField().getText());
    }

    @Test
    void lengthFieldLostFocus() {
        window.focusLength();
        window.getStartField().setText("8");
        window.getLengthField().setText("10");
        window.focusStart(); // length lost focus
        assertEquals("18", window.getEndField().getText());
    }
}