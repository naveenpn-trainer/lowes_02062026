package hands_on._06_configuration_and_bean.config;

import hands_on._06_configuration_and_bean.adapter.RazorPaymentAdapter;
import hands_on._06_configuration_and_bean.payment.Payment;
import hands_on._06_configuration_and_bean.third_party.RazorPayment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public RazorPayment getRazorPayment(){
        return new RazorPayment();
    }

    @Bean("razorpay")
    public Payment getPayment(RazorPayment razorPayment){
        return new RazorPaymentAdapter(razorPayment);
    }
}
