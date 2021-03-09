package com.demo.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.cts.model.Book;

@Controller
public class BookController {

	
	@GetMapping("/")
	public String insertBook()
	{
		return "insert";
	}
	
	@PostMapping("/bookadd")
	public String bookAdd(Model map, @RequestParam int id, @RequestParam String title)
	{
	      Book book=new Book(); // model object
	      book.setBookId(id);   // we are storing the data which is passed as parameters
	      book.setBookTitle(title);
	      System.out.println(book.getBookId());
	      System.out.println(book.getBookTitle());
	      System.out.println(book);
	      map.addAttribute("bookdetails", book);
	      return "success";
	      
	}
}
