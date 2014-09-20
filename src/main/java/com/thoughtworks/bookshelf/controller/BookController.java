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

@Controller
@RequestMapping("/")
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value = "books", method = RequestMethod.GET)
    public String getAllBooks(ModelMap model) throws Exception {
        model.addAttribute("books", bookService.findAllbooks());
        return "books/show-books";
    }

    @RequestMapping(value = "books/delete/{id}", method = RequestMethod.POST)
    public String deleteBook(@PathVariable int id, ModelMap model) throws Exception {
        bookService.deleteBookById(id);
        return "redirect:/books";
    }

    @RequestMapping(value = "books/edit/{id}", method = RequestMethod.GET)
    public String editBook(@PathVariable int id, ModelMap model) throws Exception {
        Book book = bookService.findBookById(id);
        model.addAttribute("book", book);
        return "books/edit-book";
    }

    @RequestMapping(value = "books/update", method = RequestMethod.POST)
    public String updateBook(@ModelAttribute("book") Book book) throws Exception {
        bookService.updateBook(book);
        return "redirect:/books";
    }

    @RequestMapping(value = "books/add", method = RequestMethod.GET)
    public String editBookWhenAdd(ModelMap model) throws Exception {
        Book book = bookService.findBookById(0);
        model.addAttribute("book", book);
        return "books/add-book";
    }

    @RequestMapping(value = "books/add", method = RequestMethod.POST)
    public String addBook(@ModelAttribute("book") Book book, ModelMap model) throws Exception {
        bookService.addBook(book);
        return "redirect:/books";
    }


}
