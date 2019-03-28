package com.d2c.shop.c_api.base;

import com.d2c.shop.config.security.context.LoginMemberHolder;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Cai
 */
public abstract class C_BaseController {

    @Autowired
    public LoginMemberHolder loginMemberHolder;
    @Autowired
    public HttpServletRequest request;

}
