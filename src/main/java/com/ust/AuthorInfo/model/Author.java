package com.ust.AuthorInfo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document

public class Author {

    private String id;
    private String authorName;
    private LocalDate dob;
    @Transient
    private List<String> BookTitles;

    public Author() {
    }

    public Author(String id, String authorName, LocalDate dob, List<String> bookTitles) {
        this.id = id;
        this.authorName = authorName;
        this.dob = dob;
        BookTitles = bookTitles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public List<String> getBookTitles() {
        return BookTitles;
    }

    public void setBookTitles(List<String> bookTitles) {
        BookTitles = bookTitles;
    }
}

