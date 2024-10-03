package com.example.ui.checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void toggle() {
        System.out.println("MacCheckbox toggled");
    }

    @Override
    public void render() {
        System.out.println("MacCheckbox rendered");
    }
}
