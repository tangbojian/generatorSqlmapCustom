package com.taotao.mybatis.mapper1;

import com.taotao.mybatis.model1.FreezeThawAmountDetail;
import java.util.List;

public interface FreezeThawAmountDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FreezeThawAmountDetail record);

    FreezeThawAmountDetail selectByPrimaryKey(Integer id);

    List<FreezeThawAmountDetail> selectAll();

    int updateByPrimaryKey(FreezeThawAmountDetail record);
}