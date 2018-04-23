package com.services.consumer;

import com.services.provider.Provider;

import java.lang.module.ModuleDescriptor;
import java.util.ServiceLoader;
import java.util.Set;

public class Consumer {

    public static void main(String[] args) {
        Iterable<Provider> providers = ServiceLoader.load(Provider.class);

        for (Provider provider : providers) {
            System.out.println(provider.getName());
        }


    }
}