package com.spring.demo.mockito.service;


import com.spring.demo.dao.BookRepository;
import com.spring.demo.entities.Book;
import com.spring.demo.services.BookServiceImpl;
import com.spring.demo.services.BookServices;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class BookServiceImplTest {
//
//    @TestConfiguration
//    static class EmployeeServiceImplTestContextConfiguration {
//
//        @Bean
//        public BookServices employeeService() {
//            return new BookServiceImpl();
//        }
//    }
//
//    @Autowired
//    private BookServiceImpl bookService;
//
//    @MockBean
//    private BookRepository bookRepository;
//
//    @Before
//    public void setUp() {
//        Book book = new Book();
//        book.setId(book.getId());
//
//        Mockito.when(bookRepository.findById(book.getId()))
//                .thenReturn(book);
//    }
//
//    @Test
//    public void whenValidId_thenBookShouldBeFound() {
//        String id;
//        Book found = bookService.findById(id);
//
//        Assert.assertEquals(found.getId());
//    }
}
