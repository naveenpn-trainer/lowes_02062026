package patterns.structural.adapter_pattern;

public interface Payment {
    void validate();
    void pay();
    void ack();
}
