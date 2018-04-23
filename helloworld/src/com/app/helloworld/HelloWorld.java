package com.app.helloworld;

public class HelloWorld {

    public static void main(String[] args) {
        Class<HelloWorld> cls = HelloWorld.class;
        Module module = cls.getModule();
        System.out.println("This module name is " + module.getName());
    }
}
