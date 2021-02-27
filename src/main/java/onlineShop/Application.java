package onlineShop;
import onlineShop.log.PaymentAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class Application {
    public static void main(String[] args) {

//        Logger logger = new ServerLogger();
//        PaymentAction paymentAction = new PaymentAction(logger);
//        paymentAction.pay(new BigDecimal(2));

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "payment.xml");

        PaymentAction paymentAction = (PaymentAction) context.getBean(PaymentAction.class);
        paymentAction.pay(new BigDecimal(2));
    }
}
