package com.zhaopin.dao;

import com.zhaopin.model.ResumeInfo;
import com.zhaopin.model.ResumeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResumeInfoMapper {
    int countByExample(ResumeInfoExample example);

    int deleteByExample(ResumeInfoExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(ResumeInfo record);

    int insertSelective(ResumeInfo record);

    List<ResumeInfo> selectByExample(ResumeInfoExample example);

    ResumeInfo selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") ResumeInfo record, @Param("example") ResumeInfoExample example);

    int updateByExample(@Param("record") ResumeInfo record, @Param("example") ResumeInfoExample example);

    int updateByPrimaryKeySelective(ResumeInfo record);

    int updateByPrimaryKey(ResumeInfo record);
    
    List<ResumeInfo> selectAllByExample(Integer id,String position,Integer state,String time,String drafts);
    
    List<ResumeInfo> selectAllByRinfoExample(ResumeInfoExample example);
    
    List<ResumeInfo> selectAllByIid(Integer Iid,String name,String place,String position,Integer salary,String drafts);
    
    List<ResumeInfo> selectByEid(Integer eId,String position,Integer state,String time,String drafts);
}