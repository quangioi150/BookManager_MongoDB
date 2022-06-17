package com.spring.demo.mapper;

import com.spring.demo.dto.AuthorDTO;
import com.spring.demo.entities.Author;
import org.mapstruct.Mapper;

@Mapper
public interface AuthorMapper extends EntitiesMapper<AuthorDTO, Author> {

}
