package com.taotao.mybatis.mapper1;

import com.taotao.mybatis.model1.FreezeThawAmountDetailFollow;
import java.util.List;

public interface FreezeThawAmountDetailFollowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FreezeThawAmountDetailFollow record);

    FreezeThawAmountDetailFollow selectByPrimaryKey(Integer id);

    List<FreezeThawAmountDetailFollow> selectAll();

    int updateByPrimaryKey(FreezeThawAmountDetailFollow record);
}