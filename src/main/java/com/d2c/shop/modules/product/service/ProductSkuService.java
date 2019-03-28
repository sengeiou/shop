package com.d2c.shop.modules.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.d2c.shop.modules.product.model.ProductSkuDO;

/**
 * @author BaiCai
 */
public interface ProductSkuService extends IService<ProductSkuDO> {

    int doDeductStock(Long id, Long productId, Integer quantity);

    int doReturnStock(Long id, Long productId, Integer quantity);

}
