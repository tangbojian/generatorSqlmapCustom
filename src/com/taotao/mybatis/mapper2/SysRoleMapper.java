package com.taotao.mybatis.mapper2;

import com.taotao.mybatis.model5.SysRole;
import java.util.List;

public interface SysRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     * @mbggenerated 2017-10-11
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     * @mbggenerated 2017-10-11
     */
    int insert(SysRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     * @mbggenerated 2017-10-11
     */
    SysRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     * @mbggenerated 2017-10-11
     */
    List<SysRole> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     * @mbggenerated 2017-10-11
     */
    int updateByPrimaryKey(SysRole record);
}