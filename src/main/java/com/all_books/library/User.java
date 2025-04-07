package com.all_books.library;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@Getter
public abstract class User{
    public User(String name) {
        this.name = name;
    }
    protected String name;
    protected String email;
    protected String phonenumber;
    protected IOOperation operations[];

    public User(String name, String email, String phonenumber) {
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    abstract public String toString();

    abstract public void menu(Database data, User user);


}
