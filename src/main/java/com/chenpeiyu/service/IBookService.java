package com.chenpeiyu.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.chenpeiyu.domain.Book;
import org.springframework.stereotype.Service;

@Service
//mybatis-plus service层快速开发
public interface IBookService extends IService<Book> {

}
