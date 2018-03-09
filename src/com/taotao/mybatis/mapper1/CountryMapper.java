package com.taotao.mybatis.mapper1;

import com.taotao.mybatis.model1.Country;
import java.util.List;

public interface CountryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Country record);

    Country selectByPrimaryKey(Integer id);

    List<Country> selectAll();

    int updateByPrimaryKey(Country record);
}