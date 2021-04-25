package com.ks.ks_account.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(insertable = false,columnDefinition = "varchar(32) default 'sys'")
    private String createBy;

    @Column(insertable = false,columnDefinition = "varchar(32) default 'sys'")
    private String updateBy;

    @CreatedDate
    private Date createDate;

    @LastModifiedDate
    private Date updateDate;

}
