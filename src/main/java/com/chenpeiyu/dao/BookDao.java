package com.chenpeiyu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenpeiyu.domain.Book;
import org.apache.ibatis.annotations.Mapper;

//编写数据层接口
@Mapper
public interface BookDao extends BaseMapper<Book> {

}
