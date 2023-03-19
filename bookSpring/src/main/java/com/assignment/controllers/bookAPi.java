package com.assignment.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.models.book;
import com.assignment.service.bookService;

@RestController
public class bookAPi {
	
	private final bookService bookServ;
	
	public bookAPi(bookService bookServ) {
		this.bookServ = bookServ;
	}
	
	@GetMapping("/api/books")
    public List<book> index() {
        return bookServ.allBooks();
    }	
	@PostMapping("/api/books")
	public  book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
        book Book = new book(title, desc, lang, numOfPages);
        return bookServ.createBook(Book);
    }	
	@GetMapping("/api/books/{id}")
    public book show(@PathVariable("id") Long id) {
        book Book = bookServ.findBook(id);
        return Book;
    }
	
	@PutMapping("/api/book/edit/{id}")
	public book updateBook(@PathVariable("id") long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
		
		
        book Book = new book(title, desc, lang, numOfPages);
        
        Book.setId(id);
         
        book updateBooks = bookServ.updateBook(Book); 
		return updateBooks;
	}
	
	@DeleteMapping("/api/book/{id}")
	public void delete(@PathVariable("id")Long id) {
		bookServ.deleteBook(id);
		
	}
	
	
	
	
}
