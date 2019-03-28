package com.d2c.shop.modules.core.controller;

import com.d2c.shop.common.api.base.BaseCtrl;
import com.d2c.shop.modules.core.model.ShopkeeperDO;
import com.d2c.shop.modules.core.query.ShopkeeperQuery;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BaiCai
 */
@Api(description = "店铺员工管理")
@RestController
@RequestMapping("/back/shopkeeper")
public class ShopkeeperController extends BaseCtrl<ShopkeeperDO, ShopkeeperQuery> {

}
