package com.ndis.demo.domain.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ndis.demo.domain.Form;
import org.apache.ibatis.annotations.Mapper;

@Mapper
/*
public interface BookDao {
    @Select("select * from tbl_book where id =#{id}")
    Book getById(Integer id);

}*/
public interface FormDao extends BaseMapper<Form>{
}