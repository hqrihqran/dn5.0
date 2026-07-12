package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // <-- The Sticker
public class BookService {
    
    private BookRepository bookRepository;

    @Autowired  // <-- Tells Spring to plug the dependency in automatically
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title) {
        System.out.println("Service: Processing book addition via Annotations...");
        bookRepository.saveData(title);
    }
}