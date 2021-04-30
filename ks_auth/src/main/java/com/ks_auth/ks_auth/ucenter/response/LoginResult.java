package com.ks_auth.ks_auth.ucenter.response;

import com.ks_auth.ks_auth.model.response.ResponseResult;
import com.ks_auth.ks_auth.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@ToString
@NoArgsConstructor
public class LoginResult extends ResponseResult {
    public LoginResult(ResultCode resultCode, String token) {
        super(resultCode);
        this.token = token;
    }
    private String token;
}
