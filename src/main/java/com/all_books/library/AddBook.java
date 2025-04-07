package com.all_books.library;

import java.util.Scanner;

import static com.all_books.library.Main.database;

public class AddBook implements IOOperation{
    @Override
    public void oper(Database data, User user) {
            Scanner s = new Scanner(System.in);
            Book book = new Book();
            System.out.println("\nEnter book name: ");
            String name = s.next();
            if(database.getBook(name)>-1){
                    System.out.println("There is a book with this name!\n");
                    user.menu(database,user);
                    return;
            }else{
                    book.setName(name);
                    System.out.println("Enter book author: ");
                    book.setAuthor(s.next());
                    System.out.println("Enter book publisher: ");
                    book.setPublisher(s.next());
                    System.out.println("Enter book collection address: ");
                    book.setAddress(s.next());
                    System.out.println("Enter qty: ");
                    book.setQty(s.nextInt());
                    System.out.println("Enter price: ");
                    book.setPrice(s.nextDouble());
                    System.out.println("Enter borrowing copies: ");
                    book.setBrwcopies(s.nextInt());
                    database.addBook(book);
                    System.out.println("Book added successfully\n");
                    user.menu(database,user);
                    s.close();
            }
    }
}
