package com.assignment12.library_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment12.library_management.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book , Long>{
    
}
