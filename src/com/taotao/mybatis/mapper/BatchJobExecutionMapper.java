package com.taotao.mybatis.mapper;

import com.taotao.mybatis.model2.BatchJobExecution;
import java.util.List;

public interface BatchJobExecutionMapper {
    int deleteByPrimaryKey(Long jobExecutionId);

    int insert(BatchJobExecution record);

    BatchJobExecution selectByPrimaryKey(Long jobExecutionId);

    List<BatchJobExecution> selectAll();

    int updateByPrimaryKey(BatchJobExecution record);
}