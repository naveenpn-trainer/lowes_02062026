package hands_on._06_configuration_and_bean.adapter;


import hands_on._06_configuration_and_bean.payment.Payment;
import hands_on._06_configuration_and_bean.third_party.RazorPayment;
import org.springframework.stereotype.Component;

//@Component("razorpay")
public class RazorPaymentAdapter implements Payment {

    private RazorPayment razorPayment;

    public RazorPaymentAdapter(RazorPayment razorPayment) {
        this.razorPayment = razorPayment;
    }

    @Override
    public void validatePayment() {
        this.razorPayment.validatePayment();
    }

    @Override
    public void pay() {
        this.razorPayment.performTransaction();
    }

    @Override
    public void acknowledge() {
        this.razorPayment.acknowledgement();
    }


}
