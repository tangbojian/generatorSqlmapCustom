package com.taotao.mybatis.mapper1;

import com.taotao.mybatis.model1.BatchStepExecutionContext;
import java.util.List;

public interface BatchStepExecutionContextMapper {
    int deleteByPrimaryKey(Long stepExecutionId);

    int insert(BatchStepExecutionContext record);

    BatchStepExecutionContext selectByPrimaryKey(Long stepExecutionId);

    List<BatchStepExecutionContext> selectAll();

    int updateByPrimaryKey(BatchStepExecutionContext record);
}