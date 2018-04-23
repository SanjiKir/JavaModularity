package com.services.consumer;

import com.services.provider.Provider;

import java.lang.module.ModuleDescriptor;
import java.util.Set;

public class Consumer {

    public static void main(String[] args) {
        Set<ModuleDescriptor.Provides> provides = Provider.class.getModule().getDescriptor().provides();

        for (ModuleDescriptor.Provides provide : provides) {
            System.out.println("Service: " + provide.service());
            System.out.println("Providers: " + provide.providers());
        }

    }
}