package com.study.dao;

import com.study.dataobject.AccountOuterDO;
import com.study.dataobject.AccountOuterDOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AccountOuterDAO {
    long countByExample(AccountOuterDOExample example);

    int deleteByExample(AccountOuterDOExample example);

    int deleteByPrimaryKey(String id);

    int insert(AccountOuterDO record);

    int insertSelective(AccountOuterDO record);

    List<AccountOuterDO> selectByExample(AccountOuterDOExample example);

    AccountOuterDO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AccountOuterDO record, @Param("example") AccountOuterDOExample example);

    int updateByExample(@Param("record") AccountOuterDO record, @Param("example") AccountOuterDOExample example);

    int updateByPrimaryKeySelective(AccountOuterDO record);

    int updateByPrimaryKey(AccountOuterDO record);
}