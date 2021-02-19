package com.home.controller;

import com.home.pojo.Book;
import com.home.service.ReadingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author JACKPOT
 */
@Controller
@RequestMapping("/readingList")
public class ReadingListController {

    @Autowired
    private ReadingListService readingListService;

    @RequestMapping(value = "/{reader}", method = RequestMethod.GET)
    @ResponseBody
    public List<Book> readBooks(@PathVariable("reader") String reader) {
        return readingListService.findByReader(reader);
    }

    @RequestMapping("/index")
    public String index() {
        return "readingList";
    }

    @RequestMapping(value = "/addBook")
    public String addBook(@RequestBody(required = false) Book book) {
        readingListService.addBook(book);
        return "readingList";
    }
}
