package com.taotao.mybatis.model1;

import java.util.Date;

public class SysRole {
    /**
     * 角色ID
     */
    private Long id;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 有效标志
     */
    private Integer enabled;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 角色ID
     * @return id 角色ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 角色ID
     * @param id 角色ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 角色名
     * @return role_name 角色名
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 角色名
     * @param roleName 角色名
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 有效标志
     * @return enabled 有效标志
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * 有效标志
     * @param enabled 有效标志
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * 创建人
     * @return create_by 创建人
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 创建人
     * @param createBy 创建人
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
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
}