package com.qcl.bean;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * 用户信息表
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class UserInfo {

    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String phone;
    private String openid;
    private String zhuohao;//桌号
    private String renshu;//用餐人数
    private Integer vippoints;//会员积分
    private Integer vipgrade;//会员等级
    private Integer record;//消费记录


    @CreatedDate//自动添加创建时间的注解
    private Date createTime;
    @LastModifiedDate//自动添加更新时间的注解
    private Date updateTime;
}
