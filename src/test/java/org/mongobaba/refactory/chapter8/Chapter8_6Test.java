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