package cn.xplanet.coding.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Author: Soroosh Sarabadani
 * Date: 3/18/13
 * Time: 11:47 PM
 */
@Service
public class OrderPostponedEmailSender implements ApplicationListener<OnOrderPostponed> {
	@Async
    @Override
    public void onApplicationEvent(OnOrderPostponed event) {
        System.out.println(String.format("Message sent for postponed order to:%s ORDER-ID:%s", event.getOrder().getCustomerInfo().getEmail(), event.getOrder().getOrderId()));
    }
}
