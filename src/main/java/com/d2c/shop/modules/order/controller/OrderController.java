package com.d2c.shop.modules.order.controller;

import com.d2c.shop.common.api.base.BaseCtrl;
import com.d2c.shop.modules.order.model.OrderDO;
import com.d2c.shop.modules.order.query.OrderQuery;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BaiCai
 */
@Api(description = "订单管理")
@RestController
@RequestMapping("/back/order")
public class OrderController extends BaseCtrl<OrderDO, OrderQuery> {

}
