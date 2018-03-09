package com.taotao.mybatis.mapper1;

import com.taotao.mybatis.model1.BatchJobExecution;
import java.util.List;

public interface BatchJobExecutionMapper {
    int deleteByPrimaryKey(Long jobExecutionId);

    int insert(BatchJobExecution record);

    BatchJobExecution selectByPrimaryKey(Long jobExecutionId);

    List<BatchJobExecution> selectAll();

    int updateByPrimaryKey(BatchJobExecution record);
}