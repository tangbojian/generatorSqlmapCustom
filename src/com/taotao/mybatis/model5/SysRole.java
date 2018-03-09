package com.taotao.mybatis.model5;

import java.util.Date;

public class SysRole {
    /**
     * 角色ID
     *
     * sys_role.id
     *
     * @mbggenerated 2017-10-11
     */
    private Long id;

    /**
     * 角色名
     *
     * sys_role.role_name
     *
     * @mbggenerated 2017-10-11
     */
    private String roleName;

    /**
     * 有效标志
     *
     * sys_role.enabled
     *
     * @mbggenerated 2017-10-11
     */
    private Integer enabled;

    /**
     * 创建人
     *
     * sys_role.create_by
     *
     * @mbggenerated 2017-10-11
     */
    private Long createBy;

    /**
     * 创建时间
     *
     * sys_role.create_time
     *
     * @mbggenerated 2017-10-11
     */
    private Date createTime;

    /**
     * @mbggenerated 2017-10-11
     */
    public Long getId() {
        return id;
    }

    /**
     * @mbggenerated 2017-10-11
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @mbggenerated 2017-10-11
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @mbggenerated 2017-10-11
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * @mbggenerated 2017-10-11
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * @mbggenerated 2017-10-11
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * @mbggenerated 2017-10-11
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * @mbggenerated 2017-10-11
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * @mbggenerated 2017-10-11
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @mbggenerated 2017-10-11
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}