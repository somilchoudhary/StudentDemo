package com.test.demo.StudentDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.demo.StudentDemo.model.Book;

@Controller
@RequestMapping("/book")
public class BookController {
	
	 @GetMapping("/viewBooks")
	    public String viewBooks(Model model) {
		 
		 List<Book> bookList = new ArrayList<Book>();
		 Book book1 = new Book();
		 book1.setAuthor("Somil");
		 book1.setIsbn("dhg5r3263");
		 book1.setName("Harrypotter");
		 
		 
		 bookList.add(book1);
	        model.addAttribute("books",bookList);
	        return "view-books";
	    }

}
