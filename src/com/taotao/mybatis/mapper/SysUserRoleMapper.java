package com.taotao.mybatis.mapper;

import com.taotao.mybatis.model2.SysUserRole;
import java.util.List;

public interface SysUserRoleMapper {
    int insert(SysUserRole record);

    List<SysUserRole> selectAll();
}