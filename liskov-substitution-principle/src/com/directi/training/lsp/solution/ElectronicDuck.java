package com.directi.training.lsp.solution;

public class ElectronicDuck implements DuckInterface {
    private boolean _on = false;

    
    @Override
    public void quack() {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            System.out.println("Can't swim when off");
        }
    }
    
    @Override
    public void swim() {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            System.out.println("Can't swim when off ");
        }
    }
    
    public void turnOn() {
        _on = true;
    }
    
    public void turnOff() {
        _on = false;
    }
}
