package com.taotao.mybatis.mapper1;

import com.taotao.mybatis.model1.BatchJobExecutionParams;
import java.util.List;

public interface BatchJobExecutionParamsMapper {
    int insert(BatchJobExecutionParams record);

    List<BatchJobExecutionParams> selectAll();
}