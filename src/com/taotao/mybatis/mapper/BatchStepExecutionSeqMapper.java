package com.taotao.mybatis.mapper;

import com.taotao.mybatis.model2.BatchStepExecutionSeq;
import java.util.List;

public interface BatchStepExecutionSeqMapper {
    int insert(BatchStepExecutionSeq record);

    List<BatchStepExecutionSeq> selectAll();
}