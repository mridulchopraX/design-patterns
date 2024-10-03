package com.example.ui.factory;

import com.example.ui.button.Button;
import com.example.ui.button.WindowsButton;
import com.example.ui.checkbox.Checkbox;
import com.example.ui.checkbox.WindowsCheckbox;

public class WindowsUIFactory implements AbstractUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
