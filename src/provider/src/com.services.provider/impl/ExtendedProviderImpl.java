package com.services.provider.impl;

import com.services.provider.Provider;

public class ExtendedProviderImpl implements Provider {

    @Override
    public String getName() {
        return ExtendedProviderImpl.class.getName();
    }
}
