package com.example.ui.button;

public class MacButton implements  Button {
    @Override
    public void click() {
        System.out.println("MacButton clicked");
    }

    @Override
    public void render() {
        System.out.println("MacButton rendered");
    }
}
