package com.taotao.mybatis.mapper1;

import com.taotao.mybatis.model1.BatchJobExecutionSeq;
import java.util.List;

public interface BatchJobExecutionSeqMapper {
    int insert(BatchJobExecutionSeq record);

    List<BatchJobExecutionSeq> selectAll();
}