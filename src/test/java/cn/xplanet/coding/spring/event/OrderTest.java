package cn.xplanet.coding.spring.event;

import org.junit.Test;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Author: Soroosh Sarabadani
 * Date: 3/18/13
 * Time: 10:30 PM
 */

@ContextConfiguration("classpath*:context.xml")
public class OrderTest extends AbstractJUnit4SpringContextTests implements ApplicationEventPublisherAware{
	
	private ApplicationEventPublisher eventPublisher;
	
    @Test
    public void you_can_see_messages_in_console_when_order_state_is_DELIVERED() {
        final Order order = new Order("111", new CustomerInfo("1234567", "soroosh.sarabadani@gmail.com"));
        order.checkOut();
        order.deliver();
        this.eventPublisher.publishEvent(new OnOrderDelivered(order));

    }

    @Test
    public void you_can_see_messages_in_console_when_order_state_is_POSTPONED() {
        final Order order = new Order("222", new CustomerInfo("12345", "soroosh.sarabadani@gmail.com"));
        order.checkOut();
        order.postponeDelivery();
        this.eventPublisher.publishEvent(new OnOrderPostponed(order));
    }

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.eventPublisher = applicationEventPublisher;
	}
}
