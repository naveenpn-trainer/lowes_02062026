package hands_on._02_di.d_constructor_di_enum;

public enum PaymentNames {
    CASH("cash"), UPI("upi"),  CREDIT_CARD("credit");
    private String name;


    PaymentNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
