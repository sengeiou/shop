package com.d2c.shop.modules.product.controller;

import com.d2c.shop.common.api.base.BaseCtrl;
import com.d2c.shop.modules.product.model.CouponProductDO;
import com.d2c.shop.modules.product.query.CouponProductQuery;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BaiCai
 */
@Api(description = "优惠券商品关系")
@RestController
@RequestMapping("/back/coupon_product")
public class CouponProductController extends BaseCtrl<CouponProductDO, CouponProductQuery> {

}
