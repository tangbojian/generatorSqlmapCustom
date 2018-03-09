package com.taotao.mybatis.mapper1;

import com.taotao.mybatis.model1.BatchStepExecution;
import java.util.List;

public interface BatchStepExecutionMapper {
    int deleteByPrimaryKey(Long stepExecutionId);

    int insert(BatchStepExecution record);

    BatchStepExecution selectByPrimaryKey(Long stepExecutionId);

    List<BatchStepExecution> selectAll();

    int updateByPrimaryKey(BatchStepExecution record);
}