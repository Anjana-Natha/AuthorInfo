package com.ust.AuthorInfo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="BookInfo",url="http://localhost:7070/book")
public interface BookClient {
    @GetMapping("/{id}")
    Book getBookById(@PathVariable("id") int id);

    @GetMapping("author/{authorId}")
    List<Book> getBooksByAuthorId(@PathVariable("authorId") int authorId);

}
