package com.taotao.mybatis.mapper;

import com.taotao.mybatis.model2.BatchJobExecutionContext;
import java.util.List;

public interface BatchJobExecutionContextMapper {
    int deleteByPrimaryKey(Long jobExecutionId);

    int insert(BatchJobExecutionContext record);

    BatchJobExecutionContext selectByPrimaryKey(Long jobExecutionId);

    List<BatchJobExecutionContext> selectAll();

    int updateByPrimaryKey(BatchJobExecutionContext record);
}