package com.taotao.mybatis.mapper1;

import com.taotao.mybatis.model1.SysUserRole;
import java.util.List;

public interface SysUserRoleMapper {
    int insert(SysUserRole record);

    List<SysUserRole> selectAll();
}