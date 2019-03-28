package com.d2c.shop.modules.product.controller;

import com.d2c.shop.common.api.base.BaseCtrl;
import com.d2c.shop.modules.product.model.ProductClassifyDO;
import com.d2c.shop.modules.product.query.ProductClassifyQuery;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BaiCai
 */
@Api(description = "商品分类管理")
@RestController
@RequestMapping("/back/product_classify")
public class ProductClassifyController extends BaseCtrl<ProductClassifyDO, ProductClassifyQuery> {

}
