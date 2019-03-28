package com.d2c.shop.b_api.base;

import com.d2c.shop.config.security.context.LoginKeeperHolder;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Cai
 */
public abstract class B_BaseController {

    @Autowired
    public LoginKeeperHolder loginKeeperHolder;
    @Autowired
    public HttpServletRequest request;

}
