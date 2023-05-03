package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Book;

@Service
public interface BookService {

	
	public Book addBook(Book book);
	public List<Book> getAllBooks();

}
