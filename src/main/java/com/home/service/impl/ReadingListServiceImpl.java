package com.home.service.impl;

import com.home.pojo.Book;
import com.home.repository.ReadingListRepository;
import com.home.service.ReadingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JACKPOT
 */
@Service
public class ReadingListServiceImpl implements ReadingListService {

    @Autowired
    private ReadingListRepository readingListRepository;


    public List<Book> findByReader(String reader) {
        return readingListRepository.findByReader(reader);
    }
}
