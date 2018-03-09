package com.taotao.mybatis.mapper;

import com.taotao.mybatis.model2.BatchStepExecutionContext;
import java.util.List;

public interface BatchStepExecutionContextMapper {
    int deleteByPrimaryKey(Long stepExecutionId);

    int insert(BatchStepExecutionContext record);

    BatchStepExecutionContext selectByPrimaryKey(Long stepExecutionId);

    List<BatchStepExecutionContext> selectAll();

    int updateByPrimaryKey(BatchStepExecutionContext record);
}