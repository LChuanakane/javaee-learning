package com.javaee.ex08.mapper;

import com.javaee.ex08.po.Book;
import java.util.List;
public interface BookMapper {
    List<Book> findBooks();
    Book findBookById(int id);
    List<Book> findBooksByCourseId(int courseId);
}

