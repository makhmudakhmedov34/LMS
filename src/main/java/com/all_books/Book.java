package com.all_books;

import lombok.Data;

@Data
public class Book {

    private String id;
    private String title;
    private String author;
    private String isbn;
    private int quantity;

}
