package com.tudou.partner.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户退出队伍请求体
 *
 * @author <a href="https://github.com/Camellia-nfl/">程序员土豆</a>
 * @from 
 */
@Data
public class TeamQuitRequest implements Serializable {

    // 开发者 [coder_tudou](https://space.bilibili.com/12890453/)

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * id
     */
    private Long teamId;

}
