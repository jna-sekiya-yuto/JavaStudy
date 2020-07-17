package com.company;

import java.util.Set;

public interface ISelectBook {

    Set<Book> selectByTitle(String title);

    Set<Book> selectByAuthor(String author);

    Book selectByIsbn(int Isbn);

    Set<Book> selectByTitle2(String title);

    Set<Book>selectByAuthor2(String author);

    Set<Book> selectByTitle(String... title);
}
