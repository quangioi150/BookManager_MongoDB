package com.spring.demo.mapper;

import com.spring.demo.dto.BookDTO;
import com.spring.demo.entities.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.Mapping;
@Mapper
public interface BookMapper extends EntitiesMapper<BookDTO, Book>{
//    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
//
//    BookDTO toDTO(Book book);

}
