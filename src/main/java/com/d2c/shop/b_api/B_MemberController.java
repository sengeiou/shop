package com.d2c.shop.b_api;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.d2c.shop.b_api.base.B_BaseController;
import com.d2c.shop.common.api.Asserts;
import com.d2c.shop.common.api.PageModel;
import com.d2c.shop.common.api.Response;
import com.d2c.shop.common.api.ResultCode;
import com.d2c.shop.common.utils.QueryUtil;
import com.d2c.shop.common.utils.ReflectUtil;
import com.d2c.shop.modules.logger.nosql.mongodb.document.UserOperateLog;
import com.d2c.shop.modules.logger.nosql.mongodb.service.UserOperateLogService;
import com.d2c.shop.modules.member.model.MemberDO;
import com.d2c.shop.modules.member.model.MemberShopDO;
import com.d2c.shop.modules.member.query.MemberShopQuery;
import com.d2c.shop.modules.member.service.MemberService;
import com.d2c.shop.modules.member.service.MemberShopService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cai
 */
@Api(description = "客户业务")
@RestController
@RequestMapping("/b_api/member")
public class B_MemberController extends B_BaseController {

    @Autowired
    private MemberService memberService;
    @Autowired
    private MemberShopService memberShopService;
    @Autowired
    private UserOperateLogService userOperateLogService;

    @ApiOperation(value = "分页查询")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public R<Page<MemberDO>> list(PageModel page) {
        MemberShopQuery query = new MemberShopQuery();
        query.setShopId(loginKeeperHolder.getLoginShopId());
        Page<MemberShopDO> pager = (Page<MemberShopDO>) memberShopService.page(page, QueryUtil.buildWrapper(query));
        List<Long> memberIds = new ArrayList<>();
        pager.getRecords().forEach(item -> memberIds.add(item.getMemberId()));
        pager.setRecords(null);
        Page<MemberDO> result = new Page<>();
        if (memberIds.size() == 0) return Response.restResult(result, ResultCode.SUCCESS);
        List<MemberDO> members = (List<MemberDO>) memberService.listByIds(memberIds);
        BeanUtil.copyProperties(pager, result, ReflectUtil.clearPublicFields());
        result.setRecords(members);
        return Response.restResult(result, ResultCode.SUCCESS);
    }

    @ApiOperation(value = "浏览记录查询")
    @RequestMapping(value = "/browse/list", method = RequestMethod.GET)
    public R<Page<UserOperateLog>> browseList(PageModel page, Long memberId) {
        MemberShopQuery query = new MemberShopQuery();
        Long shopId = loginKeeperHolder.getLoginShopId();
        query.setShopId(shopId);
        query.setMemberId(memberId);
        MemberShopDO memberShop = memberShopService.getOne(QueryUtil.buildWrapper(query));
        Asserts.notNull("该客户不属于本门店", memberShop);
        Page<UserOperateLog> pager = userOperateLogService.findPage(page, memberId, shopId);
        return Response.restResult(pager, ResultCode.SUCCESS);
    }

}
