package com.taotao.mybatis.mapper;

import com.taotao.mybatis.model2.School;
import java.util.List;

public interface SchoolMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(School record);

    School selectByPrimaryKey(Integer id);

    List<School> selectAll();

    int updateByPrimaryKey(School record);
}