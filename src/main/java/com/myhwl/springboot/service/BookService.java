package com.myhwl.springboot.service;

import java.util.List;


import com.myhwl.springboot.entity.Book;

public interface BookService {
	public List<Book> getAllBooks();
	public void addBook(Book book);
}
