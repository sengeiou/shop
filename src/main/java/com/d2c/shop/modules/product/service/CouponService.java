package com.d2c.shop.modules.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.d2c.shop.modules.product.model.CouponDO;

/**
 * @author BaiCai
 */
public interface CouponService extends IService<CouponDO> {

    int updateConsumption(Long id);

}
