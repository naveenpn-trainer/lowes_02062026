package _01_coupling._02_loose_coupling;

public interface Payment {
    void validatePayment();
    void pay();
    void acknowledge();
}
