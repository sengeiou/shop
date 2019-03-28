package com.d2c.shop.modules.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.d2c.shop.modules.order.model.OrderItemDO;
import com.d2c.shop.modules.order.query.OrderItemQuery;

import java.util.Map;

/**
 * @author BaiCai
 */
public interface OrderItemService extends IService<OrderItemDO> {

    Map<String, Object> countDaily(OrderItemQuery query);

}
