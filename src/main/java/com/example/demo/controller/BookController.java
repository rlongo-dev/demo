package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Book;
import com.example.demo.dto.ServiceResponse;

@RestController
public class BookController {
	
	List<Book> bookStore = new ArrayList<Book>();
	
	
	@GetMapping("/saveBook")
	public ResponseEntity<Object> addBook(@RequestBody Book book){
		bookStore.add(book);
		ServiceResponse<Book> response = new ServiceResponse<Book>("success", book);
		return new ResponseEntity<Object>(response,HttpStatus.OK);
	}
	
	@GetMapping("/getBooks")
	public ResponseEntity<Object> getAllBooks(){
		ServiceResponse<List<Book>> response = new ServiceResponse<List<Book>>("success", bookStore);
		return new ResponseEntity<Object>(response,HttpStatus.OK);
	}
}