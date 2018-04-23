package com.services.provider.impl;

import com.services.provider.Provider;

public class ProviderImpl implements Provider {


    @Override
    public String getName() {
        return ProviderImpl.class.getName();
    }
}
