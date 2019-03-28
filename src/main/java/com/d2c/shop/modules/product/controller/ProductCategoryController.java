package com.d2c.shop.modules.product.controller;

import com.d2c.shop.common.api.base.BaseCtrl;
import com.d2c.shop.modules.product.model.ProductCategoryDO;
import com.d2c.shop.modules.product.query.ProductCategoryQuery;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BaiCai
 */
@Api(description = "商品品类管理")
@RestController
@RequestMapping("/back/product_category")
public class ProductCategoryController extends BaseCtrl<ProductCategoryDO, ProductCategoryQuery> {

}
