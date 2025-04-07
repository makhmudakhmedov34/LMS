package com.all_books.library;

import java.util.Scanner;

import static com.all_books.library.Main.database;

public class DeleteAllData implements IOOperation{
    @Override
    public void oper(Database data, User user) {

        System.out.println("Are you sure that you want to delete all data?\n1. Continue\n2. Main Menu");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if (i == 1) {
            database.deleteAllData();
        } else {
            user.menu(database,user);
        }

    }
}
