package hands_on._02_di.d_constructor_di_enum;

public interface Payment {
    String getType();
    void validatePayment();
    void pay();
    void acknowledge();
}
