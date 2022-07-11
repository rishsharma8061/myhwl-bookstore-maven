package com.myhwl.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhwl.springboot.dao.BookDAO;
import com.myhwl.springboot.entity.Book;

@Service
public class BookServiceImpl  implements BookService{

	@Autowired
	BookDAO bookDAO;
	
	@Override
	public List<Book> getAllBooks() {
		System.out.println("-----BookServiceImpl--getAllBooks()---------");
    	return bookDAO.findAll();
	}

	@Override
	public void addBook(Book book) {
		System.out.println("-----BookServiceImpl--addBook()---------");
		bookDAO.save(book);
	}
	
}
