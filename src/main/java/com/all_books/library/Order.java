package com.all_books.library;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {

    private Book book;
    private User user;
    private double price;
    private int qty;

    public String toString() {
        return "Book name: " + book.getName() + "\n" +
                "Username: " + user.getName() + "\n" +
                "Price: " + String.valueOf(price) + "\n" +
                "Qty: " + String.valueOf(qty);
    }

    public String toString2() {
        return book.getName() + "<N/>" +user.getName() + "<N/>" + String.valueOf(price) + "<N/>" +
                String.valueOf(qty);
    }

}
