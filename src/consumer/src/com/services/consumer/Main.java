package com.services.consumer;

import optionalModule.Optional;

public class Main {

    public static void main(String[] args) {


        try {
            Class<?> clazz = Class.forName("optionalModule.Optional");
            Optional instance =
                    (Optional) clazz.getConstructor().newInstance();
            System.out.println("Optional class was initialized");
        } catch (ReflectiveOperationException e) {
            System.out.println("Falling to alternative soultion");
        }
    }

}
