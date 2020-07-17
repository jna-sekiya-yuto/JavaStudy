package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 本棚
 */
public class BookShelf {

    // 問題4_1
    private Category category;

    private List<Book> books;

    // 問題4_2
    // コンストラクタ
    public BookShelf(Category category) {
        this.category = category;
        this.books = new ArrayList<>();
    }

    // 問題4_3①
    public Category getCategory() {
        return category;
    }

    // 問題4_3②
    public void addBook(Book book) {
        books.add(book);
    }

    // 問題4_3③
    Book getBook(int index) {
        if(0 <= index && index < books.size()) {
            return books.get(index);
        }
        else{
            return null;
        }

    }

    // 問題4_3④
    boolean removeBook(int index) {
        books.remove(index);
        return true;
    }

    // 問題4_3⑤
    int getBookSize() {
        return books.size();
    }

    // 問題4_3⑥
    Iterator<Book> getIterator() {
        return books.iterator();
    }


}
