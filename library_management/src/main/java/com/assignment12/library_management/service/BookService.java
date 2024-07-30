package com.assignment12.library_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment12.library_management.entity.Book;
import com.assignment12.library_management.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getallBooks() {
        return bookRepository.findAll();
    }

    public Book retriveById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateById(Long id, Book BookDetails) {
        Book bk = bookRepository.findById(id).orElse(null);
        if (bk != null) {
            bk.setAuthor(BookDetails.getAuthor());
            bk.setTitle(BookDetails.getTitle());
            bk.setIsbn(BookDetails.getIsbn());
            bk.setQuantity(BookDetails.getQuantity());
            bookRepository.save(bk);
        }
        return bk;
    }
    public Book deleteById(Long id){
        Book bk = bookRepository.findById(id).orElse(null);
        if(bk != null){
            bookRepository.delete(bk);
        }
        return bk;
        
    }

  
}
