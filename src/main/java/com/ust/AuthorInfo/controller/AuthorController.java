package com.ust.AuthorInfo.controller;

import com.ust.AuthorInfo.model.Author;
import com.ust.AuthorInfo.repository.AuthorRepository;
import com.ust.AuthorInfo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private AuthorService authorService;

    @PostMapping("/addauthor")
    public Author addAuthor(@RequestBody Author author) {
        return authorRepository.save(author);
    }
    @GetMapping("/getauthor/{id}")
    public Author getAuthorById(@PathVariable int id) {
        return authorRepository.findById(id).orElseThrow();
    }
    @GetMapping("/getauthorwithbooks/{id}")
    public Author getAuthorWithBooks(@PathVariable int id) {
        return authorService.findAuthorWithBooks(id);
    }



}
