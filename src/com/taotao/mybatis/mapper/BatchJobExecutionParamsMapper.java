package com.taotao.mybatis.mapper;

import com.taotao.mybatis.model2.BatchJobExecutionParams;
import java.util.List;

public interface BatchJobExecutionParamsMapper {
    int insert(BatchJobExecutionParams record);

    List<BatchJobExecutionParams> selectAll();
}