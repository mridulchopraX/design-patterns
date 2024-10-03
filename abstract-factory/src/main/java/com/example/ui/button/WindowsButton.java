package com.example.ui.button;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("WindowsButton clicked");
    }

    @Override
    public void render() {
        System.out.println("WindowsButton rendered");
    }
}
