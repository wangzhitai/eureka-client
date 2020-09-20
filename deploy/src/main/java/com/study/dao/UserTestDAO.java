package com.study.dao;

import com.study.dataobject.UserTestDO;
import com.study.dataobject.UserTestDOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserTestDAO {
    long countByExample(UserTestDOExample example);

    int deleteByExample(UserTestDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTestDO record);

    int insertSelective(UserTestDO record);

    List<UserTestDO> selectByExample(UserTestDOExample example);

    UserTestDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserTestDO record, @Param("example") UserTestDOExample example);

    int updateByExample(@Param("record") UserTestDO record, @Param("example") UserTestDOExample example);

    int updateByPrimaryKeySelective(UserTestDO record);

    int updateByPrimaryKey(UserTestDO record);
}