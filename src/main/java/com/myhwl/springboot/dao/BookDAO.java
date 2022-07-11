package com.myhwl.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myhwl.springboot.entity.Book;

public interface BookDAO extends JpaRepository<Book, Integer>{

}
