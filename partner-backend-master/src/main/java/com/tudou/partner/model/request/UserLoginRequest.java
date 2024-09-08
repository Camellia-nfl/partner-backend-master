package com.tudou.partner.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author <a href="https://github.com/Camellia-nfl/">程序员土豆</a>
 * @from 
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;


    private String userPassword;
}
