import com.services.provider.impl.ExtendedProviderImpl;
import com.services.provider.impl.ProviderImpl;

module provider {
    exports  com.services.provider;
    provides com.services.provider.Provider
            with ProviderImpl, ExtendedProviderImpl;

}