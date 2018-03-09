package com.taotao.mybatis.mapper1;

import com.taotao.mybatis.model1.School;
import java.util.List;

public interface SchoolMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(School record);

    School selectByPrimaryKey(Integer id);

    List<School> selectAll();

    int updateByPrimaryKey(School record);
}