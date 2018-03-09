package com.taotao.mybatis.mapper1;

import com.taotao.mybatis.model1.AccountBankInfoSnapshot;
import java.util.List;

public interface AccountBankInfoSnapshotMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AccountBankInfoSnapshot record);

    AccountBankInfoSnapshot selectByPrimaryKey(Integer id);

    List<AccountBankInfoSnapshot> selectAll();

    int updateByPrimaryKey(AccountBankInfoSnapshot record);
}