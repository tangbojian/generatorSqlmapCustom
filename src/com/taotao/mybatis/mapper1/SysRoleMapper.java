package com.taotao.mybatis.mapper1;

import com.taotao.mybatis.model1.SysRole;
import java.util.List;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    SysRole selectByPrimaryKey(Long id);

    List<SysRole> selectAll();

    int updateByPrimaryKey(SysRole record);
}