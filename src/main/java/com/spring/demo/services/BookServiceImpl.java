package com.spring.demo.services;

import com.spring.demo.dao.AuthorRepository;
import com.spring.demo.dao.BookRepository;
import com.spring.demo.dto.BookDTO;
import com.spring.demo.entities.Book;
import com.spring.demo.mapper.BookMapper;
import com.spring.demo.mapper.BookMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookServices {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;
    private final BookMapper bookMapper = new BookMapperImpl();

    @Override
    public BookDTO createBook(BookDTO bookDTO) {
        Book book = new Book();
        book.setBookName(bookDTO.getBookName());
        book.setContent(bookDTO.getContent());
        book.setDescription(bookDTO.getDescription());
        book.setTitle(bookDTO.getTitle());
        bookRepository.save(book);
        return bookDTO;
    }

    @Override
    public Book updateBook(BookDTO bookDTO) {
        return null;
    }

    @Override
    public List<Book> findAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public void deleteBookById(String id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book updateById(@PathVariable("id") String id) {
        return bookRepository.save(bookRepository.findById(id).get());
    }

    @Override
    public BookDTO findById(@PathVariable("id") String id) {
        Book book = bookRepository.findById(id).get();
        return bookMapper.toDTO(book);
    }
}
