package com.taotao.mybatis.mapper;

import com.taotao.mybatis.model2.SysRolePrivilege;
import java.util.List;

public interface SysRolePrivilegeMapper {
    int insert(SysRolePrivilege record);

    List<SysRolePrivilege> selectAll();
}