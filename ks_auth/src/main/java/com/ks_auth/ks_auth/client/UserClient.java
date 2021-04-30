package com.ks_auth.ks_auth.client;

import com.alibaba.fastjson.JSONObject;
import com.ks_auth.ks_auth.config.XcServiceList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author imc700
 * @since 2021/4/29
 */
@FeignClient(value = XcServiceList.KS_ACCOUNT)
public interface UserClient {
    @GetMapping("/user/findByUsername")
    public JSONObject findByUsername(@RequestParam("username") String username);
}
