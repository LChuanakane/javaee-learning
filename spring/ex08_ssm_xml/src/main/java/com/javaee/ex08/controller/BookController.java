package com.javaee.ex08.controller;

import com.javaee.ex08.po.Book;
import com.javaee.ex08.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("books", bookService.findBooks());
        return "book/book_list";
    }
    @RequestMapping("/detail")
    public String detail(@RequestParam("id") int id, Model model){
        Book book = bookService.findBookById(id);
        model.addAttribute("book", book);
        return "book/book_detail";
    }
    @RequestMapping("/byCourse")
    public String byCourse(@RequestParam("courseId") int courseId, Model model){
        List<Book> books = bookService.findBooksByCourseId(courseId);
        model.addAttribute("books", books);
        return "book/book_by_course";
    }
}

