package com.ks.ks_account.entity;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="t_user",uniqueConstraints = @UniqueConstraint(columnNames = {"username"}))
@Data
public class User extends BaseEntity{
    @Column
    private String username;
    @Column
    private String password;
    @Column(insertable = false,columnDefinition = "varchar(64) default 'user'")
    private String role;
    @Column
    private String sourceFrom;


    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
