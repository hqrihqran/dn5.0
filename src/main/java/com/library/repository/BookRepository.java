package com.library.repository;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void saveData(String bookTitle) {
        System.out.println("Database: '" + bookTitle + "' has been successfully saved to the library catalog!");
    }
}

