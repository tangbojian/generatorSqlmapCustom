package com.taotao.mybatis.mapper;

import com.taotao.mybatis.model2.BatchJobSeq;
import java.util.List;

public interface BatchJobSeqMapper {
    int insert(BatchJobSeq record);

    List<BatchJobSeq> selectAll();
}