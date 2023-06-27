package com.idea.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实现类
 */
@lombok.Data
public class AdminParam implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String icon;//头像
    private String email;//邮箱
    private String nickName;//昵称
    private String note;//备注
    private Date createTime;//创建时间
    private Date loginTime;//最后登录时间
    private Integer status;//帐号启用状态

//    `id` bigint(20) NOT NULL AUTO_INCREMENT,
//  `username` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//  `password` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//  `icon` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
//            `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
//            `nick_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称',
//            `note` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
//            `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
//            `login_time` datetime NULL DEFAULT NULL COMMENT '最后登录时间',
//            `status` int(1) NULL DEFAULT 1 COMMENT '帐号启用状态：0->禁用；1->启用',
}
