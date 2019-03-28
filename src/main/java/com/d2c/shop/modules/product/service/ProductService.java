package com.d2c.shop.modules.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.d2c.shop.modules.product.model.ProductDO;

/**
 * @author BaiCai
 */
public interface ProductService extends IService<ProductDO> {

    ProductDO doCreate(ProductDO product);

    boolean doUpdate(ProductDO product);

    int doDeductStock(Long id, Integer quantity);

    int doReturnStock(Long id, Integer quantity);

}
