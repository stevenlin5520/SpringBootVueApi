package com.steven.springbootvue.api.dao;

import com.steven.springbootvue.api.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book,Integer> {
}
