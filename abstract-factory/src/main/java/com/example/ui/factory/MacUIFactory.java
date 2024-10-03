package com.example.ui.factory;

import com.example.ui.button.Button;
import com.example.ui.button.MacButton;
import com.example.ui.checkbox.Checkbox;
import com.example.ui.checkbox.MacCheckbox;

public class MacUIFactory implements  AbstractUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
