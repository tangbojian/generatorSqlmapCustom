package com.taotao.mybatis.mapper1;

import com.taotao.mybatis.model1.SpecialInterestTempHis;
import java.util.List;

public interface SpecialInterestTempHisMapper {
    int deleteByPrimaryKey(String loanInfoId);

    int insert(SpecialInterestTempHis record);

    SpecialInterestTempHis selectByPrimaryKey(String loanInfoId);

    List<SpecialInterestTempHis> selectAll();

    int updateByPrimaryKey(SpecialInterestTempHis record);
}