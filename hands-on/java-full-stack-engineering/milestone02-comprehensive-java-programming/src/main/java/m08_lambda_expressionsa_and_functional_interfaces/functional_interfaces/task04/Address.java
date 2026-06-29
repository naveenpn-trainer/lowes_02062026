package m08_lambda_expressionsa_and_functional_interfaces.functional_interfaces.task04;

public class Address {
    int person_id;
    String address = "136,Karnataka,Bengaluru,560061";
    int address_id;

    public Address(int person_id,int address_id, String address) {
        this.person_id = person_id;
        this.address_id = address_id;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "person_id=" + person_id +
                ", address='" + address + '\'' +
                ", address_id=" + address_id +
                '}';
    }
}
