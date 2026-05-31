package com.javaee.ex08.service.impl;

import com.javaee.ex08.mapper.BookMapper;
import com.javaee.ex08.po.Book;
import com.javaee.ex08.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    public List<Book> findBooks(){
        return bookMapper.findBooks();
    }

    public Book findBookById(int id){
        return bookMapper.findBookById(id);
    }

    public List<Book> findBooksByCourseId(int courseId){
        return bookMapper.findBooksByCourseId(courseId);
    }
}