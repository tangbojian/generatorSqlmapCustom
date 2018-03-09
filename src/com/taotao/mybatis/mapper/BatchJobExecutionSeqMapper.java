package com.taotao.mybatis.mapper;

import com.taotao.mybatis.model2.BatchJobExecutionSeq;
import java.util.List;

public interface BatchJobExecutionSeqMapper {
    int insert(BatchJobExecutionSeq record);

    List<BatchJobExecutionSeq> selectAll();
}