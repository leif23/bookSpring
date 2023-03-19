package com.assignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.assignment.models.book;
import com.assignment.respositories.bookRepositories;

@Service
public class bookService {
	private final bookRepositories bookRepo;
	
	
	public bookService(bookRepositories bookRepo) {
		
		this.bookRepo = bookRepo;
	}
	
	
	public List<book> allBooks(){
		return this.bookRepo.findAll();
	}
	
	public book createBook(book b){
		return this.bookRepo.save(b);
	}
	
	public book findBook(Long id) {
		Optional <book> optionalBook = bookRepo.findById(id);
		
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		}else {
			return null;
		}
		
	}
	
	public book updateBook(book Books) {
		return this.bookRepo.save(Books);
	}
	
	
	public void deleteBook(Long id) {
		 this.bookRepo.deleteById(id);
	}
}
