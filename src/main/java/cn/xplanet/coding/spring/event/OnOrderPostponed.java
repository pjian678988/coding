package cn.xplanet.coding.spring.event;

/**
 * Author: Soroosh Sarabadani
 * Date: 3/18/13
 * Time: 11:39 PM
 */
@SuppressWarnings("serial")
public class OnOrderPostponed extends OnOrderStatusChanged {
    public OnOrderPostponed(Order order) {
        super(order);
    }
}
