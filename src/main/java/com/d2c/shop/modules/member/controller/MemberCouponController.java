package com.d2c.shop.modules.member.controller;

import com.d2c.shop.common.api.base.BaseCtrl;
import com.d2c.shop.modules.member.model.MemberCouponDO;
import com.d2c.shop.modules.member.query.MemberCouponQuery;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BaiCai
 */
@Api(description = "会员优惠券关系")
@RestController
@RequestMapping("/back/member_coupon")
public class MemberCouponController extends BaseCtrl<MemberCouponDO, MemberCouponQuery> {

}
