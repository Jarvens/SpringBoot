package com.kunlun.web.service;

import com.kunlun.common.TokenModel;

import java.util.UUID;

/**
 * Created by kunlun on 2017/3/19.
 */
public interface TokenService {

    /**
     * 生成token
     *
     * @param userId
     * @return
     */
    TokenModel createToken(Long userId);

    /**
     * 检查token是否有效
     *
     * @param tokenModel
     * @return
     */
    boolean checkToken(TokenModel tokenModel);

    /**
     * token解析
     *
     * @param authentication
     * @return
     */
    TokenModel getToken(String authentication);

}
