package com.ks_auth.ks_auth.model;

import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {
    private Long id;

    private String createBy;

    private String updateBy;

    private Date createDate;

    private Date updateDate;

}
