package com.all_books.library;

import java.util.Scanner;

import static com.all_books.library.Main.database;

public class ReturnBook implements IOOperation{
    @Override
    public void oper(Database data, User user) {

        System.out.println("Enter book name:");
        Scanner s = new Scanner(System.in);
        String bookname = s.next();
        if (!database.getBrws().isEmpty()) {
            for (Borrowing b : database.getBrws()) {
                if (b.getBook().getName().matches(bookname) &&
                        b.getUser().getName().matches(user.getName())) {
                    Book book = b.getBook();
                    int i = database.getAllBooks().indexOf(book);
                    if (b.getDaysLeft() < 0) {
                        System.out.println("You are late!!");
                        System.out.println("You have to pay " + Math.abs(b.getDaysLeft() * 50) + " as fine");
                    }
                    book.setBrwcopies(book.getBrwcopies() + 1);
                    database.returnBook(b,book,i);
                    System.out.println("Book returned\nThank you!\n");
                    break;
                }else{
                    System.out.println("You didn't borrow this book!\n");
                }
            }
        } else {
            System.out.println("You didn't borrow this book!\n");
        }
        user.menu(database, user);
    }
}
