package com.d2c.shop.modules.order.controller;

import com.d2c.shop.common.api.base.BaseCtrl;
import com.d2c.shop.modules.order.model.CrowdGroupDO;
import com.d2c.shop.modules.order.query.CrowdGroupQuery;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BaiCai
 */
@Api(description = "拼团团组管理")
@RestController
@RequestMapping("/back/crowd_group")
public class CrowdGroupController extends BaseCtrl<CrowdGroupDO, CrowdGroupQuery> {

}
