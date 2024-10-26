package com.ust.AuthorInfo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Author {

    private String id;
    private String authorName;
    private LocalDate dob;
    @Transient
    private List<String> BookTitles;

}

