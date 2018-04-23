import com.services.provider.Provider;

module consumer {
    requires provider;
    requires static optionalModule;
    uses Provider;
}
