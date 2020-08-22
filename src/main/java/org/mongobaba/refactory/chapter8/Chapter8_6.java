package org.mongobaba.refactory.chapter8;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Duplicate Observed Data
 * 复制被监视数据
 */
public class Chapter8_6 {
    static class MyFrame extends Frame {
        private TextField focused;

        void switchFocus(TextField field) {
            if (focused != null) {
                for (FocusListener listener : getFocusListeners()) {
                    listener.focusLost(new FocusEvent(focused, FocusEvent.FOCUS_LOST));
                }
            }
            focused = field;
        }
    }

    static class IntervalWindow extends MyFrame {
        // TODO 为如下数据项建立领域类
        private TextField _startField = new TextField();
        private TextField _endField = new TextField();
        private TextField _lengthField = new TextField();

        IntervalWindow() {
            addFocusListener(new SymFocus());
        }

        class SymFocus extends FocusAdapter {
            @Override
            public void focusLost(FocusEvent event) {
                Object object = event.getSource();
                if (object == _startField) {
                    StartField_FocusLost(event);
                } else if (object == _endField) {
                    EndField_FocusLost(event);
                } else if (object == _lengthField) {
                    LengthField_FocusLost(event);
                }
            }
        }

        public void focusStart() {
            switchFocus(_startField);
        }

        public void focusEnd() {
            switchFocus(_endField);
        }

        public void focusLength() {
            switchFocus(_lengthField);
        }

        public TextField getStartField() {
            return _startField;
        }

        public TextField getEndField() {
            return _endField;
        }

        public TextField getLengthField() {
            return _lengthField;
        }

        private void StartField_FocusLost(FocusEvent event) {
            if (isNotInteger(_startField.getText())) {
                _startField.setText("0");
            }
            calculateLength();
        }

        private void EndField_FocusLost(FocusEvent event) {
            if (isNotInteger(_endField.getText())) {
                _endField.setText("0");
            }
            calculateLength();
        }

        private void LengthField_FocusLost(FocusEvent event) {
            if (isNotInteger(_lengthField.getText())) {
                _lengthField.setText("0");
            }
            calculateEnd();
        }

        private boolean isNotInteger(String text) {
            try {
                Integer.parseInt(text);
                return false;
            } catch (NumberFormatException e) {
                return true;
            }
        }

        // TODO 将此方法转移到领域类中
        private void calculateLength() {
            try {
                int start = Integer.parseInt(_startField.getText());
                int end = Integer.parseInt(_endField.getText());
                int length = end - start;
                _lengthField.setText(String.valueOf(length));
            } catch (NumberFormatException e) {
                throw new RuntimeException("Unexpected Number Format Error");
            }
        }

        // TODO 将此方法转移到领域类中
        private void calculateEnd() {
            try {
                int start = Integer.parseInt(_startField.getText());
                int length = Integer.parseInt(_lengthField.getText());
                int end = start + length;
                _endField.setText(String.valueOf(end));
            } catch (NumberFormatException e) {
                throw new RuntimeException("Unexpected Number Format Error");
            }
        }
    }
}
