package com.taotao.mybatis.mapper;

import com.taotao.mybatis.model2.BatchJobInstance;
import java.util.List;

public interface BatchJobInstanceMapper {
    int deleteByPrimaryKey(Long jobInstanceId);

    int insert(BatchJobInstance record);

    BatchJobInstance selectByPrimaryKey(Long jobInstanceId);

    List<BatchJobInstance> selectAll();

    int updateByPrimaryKey(BatchJobInstance record);
}