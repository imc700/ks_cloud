package com.ks.ks_zuul;

import com.ks.ks_zuul.util.CookieUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author imc700
 * @since 2021/4/30
 */
@Service
public class AuthService {
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    //查询身份令牌
    public String getTokenFromCookie(ServerHttpRequest request){
        Map<String, String> cookieMap = CookieUtil.readCookie(request, "uid");
        String access_token = cookieMap.get("uid");
        if(StringUtils.isEmpty(access_token)){
            return null;
        }
        return access_token;
    }
    //查询令牌的有效期
    public long getExpire(String access_token){
        //key
        String key = "user_token:"+access_token;
        Long expire = stringRedisTemplate.getExpire(key, TimeUnit.SECONDS);
        return expire;
    }

    public void delayTokenTime(String access_token) {
        String key = "user_token:"+access_token;
        stringRedisTemplate.expire(key,7200 , TimeUnit.MILLISECONDS);
    }
}
