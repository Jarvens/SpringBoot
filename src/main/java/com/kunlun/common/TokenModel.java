package com.kunlun.common;

import java.io.Serializable;

/**
 *
 * Token  封装
 * Created by kunlun on 2017/3/19.
 */
public class TokenModel implements Serializable {

    private static final long serialVersionUID = -3986541408108903846L;

    //用户id
    private Long id;

    //用户唯一uuid
    private String token;

    public TokenModel(Long id, String token) {
        this.id = id;
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
