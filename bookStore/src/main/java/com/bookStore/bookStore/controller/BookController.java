package com.bookStore.bookStore.controller;

import com.bookStore.bookStore.entity.Book;
import com.bookStore.bookStore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class BookController {
    @Autowired
    private BookService service;
    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/book_register")
    public String bookRegister() {
        return "bookRegister";
    }
    @GetMapping("/available_books")
    public String getAllBooks(){
        return "bookList";
    }
    @PostMapping("/save")
    public String addBook(@ModelAttribute Book book) {
        service.save(book);
        return "redirect:/available_books";
    }
}
