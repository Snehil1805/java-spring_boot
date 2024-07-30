package com.assignment12.library_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.assignment12.library_management.entity.Book;
import com.assignment12.library_management.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/books")

public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping()
    public ResponseEntity<List<Book>> getAllBooks(){
        return new ResponseEntity<>(bookService.getallBooks(),HttpStatus.OK);
    }
    
    @GetMapping("/{BookId}")
    public ResponseEntity<Book> retriveById(@PathVariable Long id){
        Book bk = bookService.retriveById(id);
        if(bk == null){
            return new ResponseEntity<>(bk,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(bk,HttpStatus.OK);
    }
    @PostMapping()
    public ResponseEntity<Book> addBook (@RequestBody Book book){
        return new ResponseEntity<>(bookService.addBook(book),HttpStatus.CREATED);
    }
    @PutMapping("/{BookId}")
    public ResponseEntity<Book> updateById (@PathVariable Long id , @RequestBody Book bookdetails){
        Book bk = bookService.updateById(id, bookdetails);
        if(bk == null){
            return new ResponseEntity<Book>(bk, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(bk,HttpStatus.OK);
    }

    @DeleteMapping("/{BookId}")
    public ResponseEntity <Book> deleteById (@PathVariable Long id){
        Book bk = bookService.deleteById(id);

        if(bk == null){
            return new ResponseEntity<>(bk , HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(bk , HttpStatus.OK);
        


        

        

    }

   
    

    
}
