package com.d2c.shop.c_api;

import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.d2c.shop.c_api.base.C_BaseController;
import com.d2c.shop.common.api.PageModel;
import com.d2c.shop.common.api.Response;
import com.d2c.shop.common.api.ResultCode;
import com.d2c.shop.common.utils.QueryUtil;
import com.d2c.shop.modules.product.model.ProductCategoryDO;
import com.d2c.shop.modules.product.query.ProductCategoryQuery;
import com.d2c.shop.modules.product.service.ProductCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @author Cai
 */
@Api(description = "商品品类业务")
@RestController
@RequestMapping("/c_api/product_category")
public class C_ProductCategoryController extends C_BaseController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @ApiOperation(value = "品类查询")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public R<Collection<ProductCategoryDO>> list(PageModel page, Long shopId) {
        ProductCategoryQuery query = new ProductCategoryQuery();
        query.setShopId(shopId);
        page.setPs(PageModel.MAX_SIZE);
        page.setDesc("sort", "create_date");
        Page<ProductCategoryDO> pager = (Page<ProductCategoryDO>) productCategoryService.page(page, QueryUtil.buildWrapper(query));
        Map<Long, ProductCategoryDO> first = new LinkedHashMap<>();
        List<ProductCategoryDO> second = new ArrayList<>();
        // 一级分类
        for (ProductCategoryDO pc : pager.getRecords()) {
            if (pc.getParentId() == null) {
                first.put(pc.getId(), pc);
            } else if (pc.getParentId() > 0) {
                second.add(pc);
            }
        }
        // 二级分类
        for (ProductCategoryDO pc : second) {
            if (first.get(pc.getParentId()) != null) {
                first.get(pc.getParentId()).getChildren().add(pc);
            }
        }
        return Response.restResult(first.values(), ResultCode.SUCCESS);
    }

}
