package com.d2c.shop.modules.security.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.d2c.shop.modules.security.model.RoleDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author BaiCai
 */
public interface RoleMapper extends BaseMapper<RoleDO> {

    List<RoleDO> findByUserId(@Param("userId") Long userId);

    List<RoleDO> findByMenuId(@Param("menuId") Long menuId);

}
