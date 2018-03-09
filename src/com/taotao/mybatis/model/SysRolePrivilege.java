package com.taotao.mybatis.model;

public class SysRolePrivilege {
    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 权限ID
     */
    private Long privilegeId;

    /**
     * 角色ID
     * @return role_id 角色ID
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 角色ID
     * @param roleId 角色ID
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 权限ID
     * @return privilege_id 权限ID
     */
    public Long getPrivilegeId() {
        return privilegeId;
    }

    /**
     * 权限ID
     * @param privilegeId 权限ID
     */
    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }
}