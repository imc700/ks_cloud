package com.ks.ks_zuul.util;

import org.springframework.http.HttpCookie;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.util.MultiValueMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2018/3/18.
 */
public class CookieUtil {

    /**
     * 设置cookie
     *
     * @param response
     * @param name     cookie名字
     * @param value    cookie值
     * @param maxAge   cookie生命周期 以秒为单位
     */
//    public static void addCookie(HttpServletResponse response, String domain, String path, String name,
//                                 String value, int maxAge, boolean httpOnly) {
//        Cookie cookie = new Cookie(name, value);
//        cookie.setDomain(domain);
//        cookie.setPath(path);
//        cookie.setMaxAge(maxAge);
//        cookie.setHttpOnly(httpOnly);
//        response.addCookie(cookie);
//    }


    /**
     * 根据cookie名称读取cookie
     *
     * @param request
     * @param cookieNames
     * @return map<cookieName, cookieValue>
     */

    public static Map<String, String> readCookie(ServerHttpRequest request, String cookieNames) {
        Map<String, String> cookieMap = new HashMap<String, String>();
        MultiValueMap<String, HttpCookie> cookies = request.getCookies();
        if (cookies != null) {
            List<HttpCookie> httpCookies = cookies.get(cookieNames);
            if (httpCookies != null && httpCookies.size() > 0) {
                HttpCookie httpCookie = httpCookies.get(0);
                cookieMap.put(httpCookie.getName(), httpCookie.getValue());
            }
        }
        return cookieMap;
    }
}
