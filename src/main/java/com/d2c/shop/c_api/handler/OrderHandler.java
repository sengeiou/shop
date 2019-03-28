package com.d2c.shop.c_api.handler;

import com.d2c.shop.modules.order.model.OrderDO;

/**
 * @author Cai
 */
public interface OrderHandler {

    void operator(OrderDO order, Object... conditions);

}
