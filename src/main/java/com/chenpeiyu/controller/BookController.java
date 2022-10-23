package com.chenpeiyu.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.chenpeiyu.domain.Book;
import com.chenpeiyu.domain.R;
import com.chenpeiyu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//打上restful风格的两个注解
@RestController
@RequestMapping("/books")
public class BookController {

    //表现层快速开发
    @Autowired
    private BookService bookService;


    @GetMapping
    public R getAll() {
        List<Book> books = bookService.getAll();
        boolean flag = true;
        return new R(flag, books);
    }

    @PostMapping
    public R save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new R(flag);
    }


    @PutMapping
    public R update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new R(flag);
    }


    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new R(flag);
    }


    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        return new R(true,book);
    }



    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize,Book book) {
        IPage<Book> bookIPage = bookService.getPage(currentPage,pageSize,book);
        System.out.println("参数==》"+book);
        if (currentPage>bookIPage.getPages()){
            //如果查询的页码数大于现在拥有的页码，将当前最大的页码做为查询结果，调用
            bookIPage = bookService.getPage((int) bookIPage.getPages(),pageSize,book);
        }
        return new R(null!=bookIPage,bookIPage);
    }
}
