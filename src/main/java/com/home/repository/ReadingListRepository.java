package com.home.repository;

import com.home.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author JACKPOT
 */
public interface ReadingListRepository extends JpaRepository<Book,Long> {

    /**
     * 根据reader查找书籍
     * @param reader reader 的名字
     * @return
     */
    List<Book> findByReader(String reader);
}
