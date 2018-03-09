package com.taotao.mybatis.mapper1;

import com.taotao.mybatis.model1.BatchStepExecutionSeq;
import java.util.List;

public interface BatchStepExecutionSeqMapper {
    int insert(BatchStepExecutionSeq record);

    List<BatchStepExecutionSeq> selectAll();
}