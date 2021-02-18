package com.home.controller;

import com.home.pojo.Book;
import com.home.service.ReadingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    public String readBooks(@PathVariable("reader") String reader, Model model) {
        List<Book> books = readingListService.findByReader(reader);
        if (books != null) {
            model.addAttribute("books", books);
        }
        return "readingList";
    }
}
