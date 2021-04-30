package com.ks.ks_account.entity;

import lombok.Data;
import lombok.ToString;

/**
 * Created by admin on 2018/3/20.
 */
@Data
@ToString
public class XcUserExt extends XcUser {

    //权限信息
//    private List<XcMenu> permissions;

    //企业信息
    private String companyId;
}
