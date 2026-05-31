package com.javaee.ex08.service;

import com.javaee.ex08.po.Book;
import java.util.List;
public interface BookService {
    List<Book> findBooks();
    Book findBookById(int id);
    List<Book> findBooksByCourseId(int courseId);
}

