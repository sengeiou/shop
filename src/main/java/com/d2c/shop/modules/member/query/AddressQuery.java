package com.d2c.shop.modules.member.query;

import com.d2c.shop.common.api.annotation.Condition;
import com.d2c.shop.common.api.base.BaseQuery;
import com.d2c.shop.common.api.emuns.ConditionEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author BaiCai
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AddressQuery extends BaseQuery {

    @Condition(condition = ConditionEnum.EQ)
    @ApiModelProperty(value = "ID")
    private Long id;
    @Condition(condition = ConditionEnum.EQ)
    @ApiModelProperty(value = "会员ID")
    private Long memberId;

}
