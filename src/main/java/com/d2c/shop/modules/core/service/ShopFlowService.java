package com.d2c.shop.modules.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.d2c.shop.modules.core.model.ShopFlowDO;

/**
 * @author BaiCai
 */
public interface ShopFlowService extends IService<ShopFlowDO> {

    int doFlowing(ShopFlowDO shopFlow);

}
