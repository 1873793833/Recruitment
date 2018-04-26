package com.zhaopin.dao;

import com.zhaopin.model.IndividualUser;
import com.zhaopin.model.IndividualUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndividualUserMapper {
    int countByExample(IndividualUserExample example);

    int deleteByExample(IndividualUserExample example);

    int deleteByPrimaryKey(Integer iId);

    int insert(IndividualUser record);

    int insertSelective(IndividualUser record);

    List<IndividualUser> selectByExample(IndividualUserExample example);

    IndividualUser selectByPrimaryKey(Integer iId);

    int updateByExampleSelective(@Param("record") IndividualUser record, @Param("example") IndividualUserExample example);

    int updateByExample(@Param("record") IndividualUser record, @Param("example") IndividualUserExample example);

    int updateByPrimaryKeySelective(IndividualUser record);

    int updateByPrimaryKey(IndividualUser record);
    
    IndividualUser selectUserByAccAndPwd(String account,String password);
}