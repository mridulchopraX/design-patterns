package com.example.ui.factory;

import com.example.ui.button.Button;
import com.example.ui.checkbox.Checkbox;

public interface AbstractUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
