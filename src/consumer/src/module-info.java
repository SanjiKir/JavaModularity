import com.services.provider.Provider;

module consumer {
    requires provider;
    uses Provider;
}
