package cn.xplanet.coding.spring.event;

/**
 * Author: Soroosh Sarabadani
 * Date: 3/18/13
 * Time: 11:38 PM
 */
@SuppressWarnings("serial")
public class OnOrderDelivered extends OnOrderStatusChanged {
    public OnOrderDelivered(Order order) {
        super(order);
    }
}
