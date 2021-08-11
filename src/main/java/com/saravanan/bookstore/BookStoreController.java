package com.saravanan.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class BookStoreController {

    private BookStoreRepository bookStoreRepository;

    @Autowired
    public BookStoreController(BookStoreRepository bookStoreRepository){
        this.bookStoreRepository=bookStoreRepository;
    }

    @RequestMapping(value="/{reader}", method= RequestMethod.GET)
    public String readersBooks(@PathVariable("reader") String reader, Model model){

        List<Book> bookList = bookStoreRepository.findByReader(reader);
        if (bookList != null) {
            model.addAttribute("bookList", bookList);
        }

        return "bookList";
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.POST)
    public String  addToBooksList(@PathVariable("reader") String reader, Book book ){
        book.setReader(reader);
        bookStoreRepository.save(book);

        return "redirect:/{reader}";
    }



}


