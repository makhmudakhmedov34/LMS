package com.all_books.library;

import java.util.Scanner;

import static com.all_books.library.Main.database;

public class Search implements IOOperation{
    @Override
    public void oper(Database data, User user) {

        System.out.println("\nEnter book name:");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        int i = database.getBook(name);
        if (i > -1) {
            System.out.println("\n"+database.getBook(i).toString()+"\n");
        } else {
            System.out.println("Book doesn't exist!\n");
        }
        user.menu(database, user);
    }

}
