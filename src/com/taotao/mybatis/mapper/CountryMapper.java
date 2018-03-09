package com.taotao.mybatis.mapper;

import com.taotao.mybatis.model2.Country;
import java.util.List;

public interface CountryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Country record);

    Country selectByPrimaryKey(Integer id);

    List<Country> selectAll();

    int updateByPrimaryKey(Country record);
}