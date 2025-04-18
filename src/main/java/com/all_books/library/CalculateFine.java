package com.all_books.library;

import java.util.Scanner;

import static com.all_books.library.Main.database;

public class CalculateFine implements IOOperation{
    @Override
    public void oper(Database data, User user) {
        System.out.println("Enter book name:");
        Scanner s = new Scanner(System.in);
        String bookname = s.next();

        boolean g = true;

        for (Borrowing b : database.getBrws()) {
            if (b.getBook().getName().matches(bookname) &&
                    b.getUser().getName().matches(user.getName())) {
                if (b.getDaysLeft() > 0) {
                    System.out.println("You are late!\n" +
                            " You have to pay " + b.getDaysLeft()*50 + " as fine\n");
                } else {
                    System.out.println("You don't have to pay fine\n");
                }
                g = false;
                break;
            }
        }
        if(g){
            System.out.println("You didn't borrow this book!!!");
        }
        user.menu(database, user);
    }
}
