package com.imooc.miaoshaproject.dao;

import com.imooc.miaoshaproject.dataobject.PromoDO;

public interface PromoDOMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(PromoDO record);


    int insertSelective(PromoDO record);


    PromoDO selectByPrimaryKey(Integer id);

    PromoDO selectByItemId(Integer itemId);


    int updateByPrimaryKeySelective(PromoDO record);


    int updateByPrimaryKey(PromoDO record);
}
