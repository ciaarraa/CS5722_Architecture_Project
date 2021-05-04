package com.compositePatternPizza;

public class Display {
    MenuComponent allMenus;
    public Display(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    public void printMenu() {
        allMenus.print();
    }
}
