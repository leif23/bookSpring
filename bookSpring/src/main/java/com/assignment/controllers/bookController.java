package com.assignment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.assignment.models.book;
import com.assignment.service.bookService;

@Controller
public class bookController {

	// injection to a book service for the sql
	
	@Autowired 
	bookService bookServ;
	
	@GetMapping("/")
	public String index() {
		
		return "redirect:/book";
	}
	
	
	@GetMapping("/book")
	public String showsBook(Model model) {
		
	List<book> Books = bookServ.allBooks();
	model.addAttribute("books",Books);

		return"index.jsp";
	}
	
	
	@GetMapping("/books/{id}")
	public String show(@PathVariable("id") long id, Model model) {
		
		model.addAttribute("books",bookServ.findBook(id));
		return "show.jsp";
	}
	
	
	
	
}
