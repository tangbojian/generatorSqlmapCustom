package com.taotao.mybatis.mapper1;

import com.taotao.mybatis.model1.BatchJobSeq;
import java.util.List;

public interface BatchJobSeqMapper {
    int insert(BatchJobSeq record);

    List<BatchJobSeq> selectAll();
}