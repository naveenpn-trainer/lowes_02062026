package patterns.structural.adapter_pattern;

public class UPIPayment implements Payment{

    @Override
    public void validate() {
        System.out.println("UPIPayment validation");
    }

    @Override
    public void pay() {
        System.out.println("UPIPayment pay");
    }

    @Override
    public void ack() {
        System.out.println("UPIPayment ack");
    }
}
