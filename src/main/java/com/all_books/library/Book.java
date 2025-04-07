package com.all_books.library;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book{

    private String name;
    private String author;
    private String publisher;
    private String address;
    private String status;
    private int qty;
    private double price;
    private int brwcopies;

    public String toString() {
        String text = "Book Name: " + name +
                "\nBook Author: " + author +
                "\nBook Publisher: " + publisher +
                "\nBook Collection Address: " + address +
                "\nQty: " + String.valueOf(qty) +
                "\nPrice: " + String.valueOf(price) +
                "\nBorrowing Copies: " + String.valueOf(brwcopies);
        return text;
    }

    public String toString2() {
        String text = name+"<N/>" + author+"<N/>" + publisher+"<N/>" + address+"<N/>" + String.valueOf(qty) +
                "<N/>" + String.valueOf(price) + "<N/>" + String.valueOf(brwcopies);
        return text;
    }

}
