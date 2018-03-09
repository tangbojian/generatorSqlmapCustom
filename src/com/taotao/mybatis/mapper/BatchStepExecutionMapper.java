package com.taotao.mybatis.mapper;

import com.taotao.mybatis.model2.BatchStepExecution;
import java.util.List;

public interface BatchStepExecutionMapper {
    int deleteByPrimaryKey(Long stepExecutionId);

    int insert(BatchStepExecution record);

    BatchStepExecution selectByPrimaryKey(Long stepExecutionId);

    List<BatchStepExecution> selectAll();

    int updateByPrimaryKey(BatchStepExecution record);
}