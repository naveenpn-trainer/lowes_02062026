package hands_on._06_configuration_and_bean.payment;

public interface Payment {
    void validatePayment();
    void pay();
    void acknowledge();
}
