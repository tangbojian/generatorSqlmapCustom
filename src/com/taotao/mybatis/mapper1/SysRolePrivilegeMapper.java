package com.taotao.mybatis.mapper1;

import com.taotao.mybatis.model1.SysRolePrivilege;
import java.util.List;

public interface SysRolePrivilegeMapper {
    int insert(SysRolePrivilege record);

    List<SysRolePrivilege> selectAll();
}