package com.ust.AuthorInfo.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private int id;
    private String bookName;
    private LocalDate publishedDate;
    private int authorId;


    public String getTitle() {
        return bookName;
    }
}
