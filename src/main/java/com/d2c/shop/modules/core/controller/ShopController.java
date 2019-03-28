package com.d2c.shop.modules.core.controller;

import com.d2c.shop.common.api.base.BaseCtrl;
import com.d2c.shop.modules.core.model.ShopDO;
import com.d2c.shop.modules.core.query.ShopQuery;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BaiCai
 */
@Api(description = "店铺管理")
@RestController
@RequestMapping("/back/shop")
public class ShopController extends BaseCtrl<ShopDO, ShopQuery> {

}
