package com.ks_auth.ks_auth.model;

import com.alibaba.fastjson.JSON;
import lombok.Data;

@Data
public class User extends BaseEntity{
    private String username;
    private String password;
    private String role;
    private String sourceFrom;


    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
