package com.ust.AuthorInfo.service;



import com.ust.AuthorInfo.client.Book;
import com.ust.AuthorInfo.client.BookClient;
import com.ust.AuthorInfo.model.Author;
import com.ust.AuthorInfo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookClient bookClient;

    public Author findAuthorWithBooks(int authorId) {
        Author author = authorRepository.findById(authorId)
                .orElseThrow(() -> new RuntimeException("Author not found"));

        List<Book> books = bookClient.getBooksByAuthorId(authorId);
        author.setBookTitles(books.stream().map(Book::getTitle).toList());

        return author;
    }


}

