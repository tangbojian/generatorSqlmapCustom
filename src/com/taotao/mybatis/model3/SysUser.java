package com.taotao.mybatis.model3;

import java.util.Date;

public class SysUser {
    /**
     * 用户ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 邮箱
     */
    private String userEmail;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 简介
     */
    private String userInfo;

    /**
     * 头像
     */
    private byte[] headImg;

    /**
     * 用户ID
     * @return id 用户ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 用户ID
     * @param id 用户ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户名
     * @return user_name 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 密码
     * @return user_password 密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 密码
     * @param userPassword 密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * 邮箱
     * @return user_email 邮箱
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 邮箱
     * @param userEmail 邮箱
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 简介
     * @return user_info 简介
     */
    public String getUserInfo() {
        return userInfo;
    }

    /**
     * 简介
     * @param userInfo 简介
     */
    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo == null ? null : userInfo.trim();
    }

    /**
     * 头像
     * @return head_img 头像
     */
    public byte[] getHeadImg() {
        return headImg;
    }

    /**
     * 头像
     * @param headImg 头像
     */
    public void setHeadImg(byte[] headImg) {
        this.headImg = headImg;
    }
}