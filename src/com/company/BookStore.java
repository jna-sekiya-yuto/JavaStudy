package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.BiPredicate;

/**
 * 本屋
 */
public class BookStore implements ISelectBook {
    // 問題4_6
    private BookShelf[] bookShelves = {
            new BookShelf(Category.HISTORY),
            new BookShelf(Category.SCIENCE),
            new BookShelf(Category.TECHNOLOGY),
            new BookShelf(Category.ART),
            new BookShelf(Category.LANGUAGE),
            new BookShelf(Category.LITERATURE)
    };

    // 問題4_7①
    public void addBook(Book book, Category category) {
        bookShelves[category.ordinal()].addBook(book);
    }

    // 問題4_7②
    public void printAllBooks() {
        for (BookShelf bookShelf : bookShelves) {
            Iterator<Book> bookIterator = bookShelf.getIterator();

            while (bookIterator.hasNext()) {
                Book book = bookIterator.next();
                System.out.println(book.toString());
            }
        }
    }

    // 問題6_3
    @Override
    public Set<Book> selectByTitle(String title) {
        // 出力する本を保持するセット
        Set<Book> books = new HashSet<>();
        // 出力する本のISBNを保持するリスト
        List<Integer> isbns = new ArrayList<>();
        for (BookShelf bookShelf: bookShelves) {
            Iterator<Book> i = bookShelf.getIterator();

            while(i.hasNext()){
                Book book = i.next();
                if (book.getTitle().contains(title) && !isbns.contains(book.getIsbn())) {
                    books.add(book);
                    isbns.add(book.getIsbn());
                }
            }
        }
        return books;
    }

    // 問題6_3
    @Override
    public Set<Book> selectByAuthor(String author) {
        // 出力する本を保持するセット
        Set<Book> books = new HashSet<>();
        // 出力する本のISBNを保持ｓるリスト
        List<Integer> isbns = new ArrayList<>();
        for (BookShelf bookShelf: bookShelves) {
            Iterator<Book> i = bookShelf.getIterator();

            while(i.hasNext()){
                Book book = i.next();
                if (book.getAuthor().contains(author) && !isbns.contains(book.getIsbn())) {
                    books.add(book);
                    isbns.add(book.getIsbn());
                }
            }
        }
        return books;
    }

    // 問題6_3
    @Override
    public Book selectByIsbn(int isbn) {
        // 出力する本
        Book book = null;
        for (BookShelf bookShelf: bookShelves) {
            Iterator<Book> i = bookShelf.getIterator();

            while (i.hasNext()) {
                Book bookInfo = i.next();
                if (bookInfo.getIsbn() == isbn) {
                    book = bookInfo;
                }
            }
        }
        return book;
    }

    //問題7-1
    private Set<Book> selectByElement(
            BiPredicate<Book, String> comp, String elem) {
        //Set<Book> selectedBooks = new HashSet<>();
        //問題9-2
        Set<Book> selectedBooks = new HashSet<>();
        for (BookShelf shelf : bookShelves) {
            Iterator<Book> i = shelf.getIterator();
            while (i.hasNext()){
                Book book = i.next();
                if (comp.test(book, elem)) {
                    selectedBooks.add(book);
                }
            }
        }
        return selectedBooks;
    }

    //問題7-3
    @Override
    public Set<Book> selectByTitle2(String title) {
        return selectByElement((bk, e) -> bk.getTitle().contains(e), title);
    }

    @Override
    public Set<Book> selectByAuthor2(String author) {
        return selectByElement((bk, e) -> bk.getAuthor().contains(e), author);
    }

    //8-2
    private Set<Book> selectByElement(
            BiPredicate<Book, String> comp, String... elem) {
        Set<Book> selectedBooks = new HashSet<>();
        for (BookShelf shelf : bookShelves) {
            Iterator<Book> i = shelf.getIterator();

            while (i.hasNext()){
                Book book = i.next();
                boolean valid = true;
                for (String str : elem) {
                    if (!comp.test(book, str)) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    selectedBooks.add(book);
                }
            }
        }
        return selectedBooks;
    }

    //8-3
    @Override
    public Set<Book> selectByTitle(String... title){
        return selectByElement((bk, e) -> bk.getTitle().contains(e), title);
    }

}
