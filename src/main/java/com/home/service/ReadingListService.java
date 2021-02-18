package com.home.service;

import com.home.pojo.Book;

import java.util.List;

public interface ReadingListService {

    /**
     * 根据reader查找书籍
     * @param reader
     * @return
     */
    List<Book> findByReader(String reader);
}
