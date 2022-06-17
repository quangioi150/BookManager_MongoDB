package com.spring.demo.mockito.repository;

import com.spring.demo.dao.BookRepository;
import com.spring.demo.entities.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {
//
//    @Autowired
//    private Book book;
//
//    @Autowired
//    private BookRepository bookRepository;
//
//    @Test
//    public void whenFindById_thenReturnBook() {
//
//        String id;
//        Book book = new Book();
//        book.setId(id);
//        Book found = bookRepository.findById(book.getId());
//
//
//        Assert.assertNotNull(found);
//        Assert.assertEquals(found.getId(id));
//
//    }

}