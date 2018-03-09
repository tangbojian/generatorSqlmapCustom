package com.taotao.mybatis.mapper1;

import com.taotao.mybatis.model1.SpecialInterestTemp;
import java.util.List;

public interface SpecialInterestTempMapper {
    int deleteByPrimaryKey(String loanInfoId);

    int insert(SpecialInterestTemp record);

    SpecialInterestTemp selectByPrimaryKey(String loanInfoId);

    List<SpecialInterestTemp> selectAll();

    int updateByPrimaryKey(SpecialInterestTemp record);
}