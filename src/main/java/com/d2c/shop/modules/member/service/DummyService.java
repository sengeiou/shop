package com.d2c.shop.modules.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.d2c.shop.modules.member.model.DummyDO;

import java.util.List;

/**
 * @author BaiCai
 */
public interface DummyService extends IService<DummyDO> {

    List<DummyDO> findRandom(Integer size);

}
