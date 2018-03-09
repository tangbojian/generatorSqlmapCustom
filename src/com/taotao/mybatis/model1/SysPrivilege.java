package com.taotao.mybatis.model1;

public class SysPrivilege {
    /**
     * 权限ID
     */
    private Long id;

    /**
     * 权限名称
     */
    private String privilegeName;

    /**
     * 权限URL
     */
    private String privilegeUrl;

    /**
     * 权限ID
     * @return id 权限ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 权限ID
     * @param id 权限ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 权限名称
     * @return privilege_name 权限名称
     */
    public String getPrivilegeName() {
        return privilegeName;
    }

    /**
     * 权限名称
     * @param privilegeName 权限名称
     */
    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName == null ? null : privilegeName.trim();
    }

    /**
     * 权限URL
     * @return privilege_url 权限URL
     */
    public String getPrivilegeUrl() {
        return privilegeUrl;
    }

    /**
     * 权限URL
     * @param privilegeUrl 权限URL
     */
    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl == null ? null : privilegeUrl.trim();
    }
}