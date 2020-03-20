package com.steven.springbootvue.api.controller;

import com.steven.springbootvue.api.dao.BookDao;
import com.steven.springbootvue.api.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Resource
    private BookDao bookDao;

    @GetMapping("/findAll")
    public List<Book> findAll(){
        return bookDao.findAll();
    }

}
