package com.thoughtworks.bookshelf.controller;

import com.thoughtworks.bookshelf.model.Book;
import com.thoughtworks.bookshelf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String getAllBooks(ModelMap model) throws Exception {
        model.addAttribute("books", bookService.findAllbooks());
        return "books";
    }

    @RequestMapping(value = "/books/delete/{id}", method = RequestMethod.GET)
    public String deleteBook(@PathVariable int id, ModelMap model) throws Exception {
        bookService.deleteBookById(id);
        return "redirect:/books";
    }

    @RequestMapping(value = "/books/edit/{id}", method = RequestMethod.GET)
    public String editBook(@PathVariable int id, ModelMap model) throws Exception {
//        Book book = new Book();
        Book book = bookService.findBookById(id);
        model.addAttribute("book",book);
        return "edit_book";
    }

    @RequestMapping(value = "books/update", method = RequestMethod.POST)
    public String updateBook(@ModelAttribute("book") Book book, HttpServletRequest request, ModelMap model) throws Exception {
        bookService.updateBook(book);
        System.out.println(book.getId());
        return "redirect:/books";
    }

    @RequestMapping(value = "/books/add", method = RequestMethod.GET)
    public String editBookWhenAdd(ModelMap model) throws Exception {
        Book book = bookService.findBookById(0);
        model.addAttribute("book",book);
        return "add_book";
    }

    @RequestMapping(value = "books/add", method = RequestMethod.POST)
    public String addBook(@ModelAttribute("book") Book book, ModelMap model) throws Exception {
        bookService.addBook(book);
        return "redirect:/books";
    }


}