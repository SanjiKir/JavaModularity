package com.services.consumer;

import java.lang.module.ModuleDescriptor;
import java.util.Set;

public class Consumer {

    public static void main(String[] args) {
        Set<ModuleDescriptor.Requires> requires = Consumer.class.getModule().getDescriptor().requires();
        for (ModuleDescriptor.Requires require : requires) {
            System.out.println("Module name: " + require.name());
            System.out.println("Modifiers: " + require.modifiers());
            System.out.println("Compiled version: " + require.compiledVersion());
            System.out.println("Raw compiled version: " + require.rawCompiledVersion());

        }
    }
}