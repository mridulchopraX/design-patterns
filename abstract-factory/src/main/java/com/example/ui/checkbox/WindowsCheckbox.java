package com.example.ui.checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void toggle() {
        System.out.println("WindowsCheckbox toggled");
    }

    @Override
    public void render() {
        System.out.println("WindowsCheckbox rendered");
    }
}
