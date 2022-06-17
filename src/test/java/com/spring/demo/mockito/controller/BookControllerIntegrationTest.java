package com.spring.demo.mockito.controller;

import com.spring.demo.controller.BookController;
import com.spring.demo.entities.Book;
import com.spring.demo.services.BookServiceImpl;
//import org.testng.annotations.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)
public class BookControllerIntegrationTest {
//
//    @Autowired
//    private MockMvc mvc;
//
//    @MockBean
//    private BookServiceImpl service;
//
//    @Test
//    public void givenEmployees_whenGetEmployees_thenReturnJsonArray()
//            throws Exception {
//
//        Book book = new Book();
//        book.setId();
//
//        given(service.findById("62a849411ecd8f79d57a23fd")).willReturn(book);
//
//        mvc.perform(get("/api/book")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.name").value("62a849411ecd8f79d57a23fd"));
//    }
}
