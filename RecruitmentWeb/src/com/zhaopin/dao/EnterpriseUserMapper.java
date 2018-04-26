package com.zhaopin.dao;

import com.zhaopin.model.EnterpriseUser;
import com.zhaopin.model.EnterpriseUserExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface EnterpriseUserMapper {
    int countByExample(EnterpriseUserExample example);

    int deleteByExample(EnterpriseUserExample example);

    int deleteByPrimaryKey(Integer eId);

    int insert(EnterpriseUser record);

    int insertSelective(EnterpriseUser record);

    List<EnterpriseUser> selectByExample(EnterpriseUserExample example);

    EnterpriseUser selectByPrimaryKey(Integer eId);

    int updateByExampleSelective(@Param("record") EnterpriseUser record, @Param("example") EnterpriseUserExample example);

    int updateByExample(@Param("record") EnterpriseUser record, @Param("example") EnterpriseUserExample example);

    int updateByPrimaryKeySelective(EnterpriseUser record);

    int updateByPrimaryKey(EnterpriseUser record);
    
    List<EnterpriseUser> selectByAccountAndTime(String account,String time);
    
    List<EnterpriseUser> selectAllByexample(EnterpriseUserExample example);
    
    EnterpriseUser selectUserByAccAndPwd(String account,String password);
    
	
}