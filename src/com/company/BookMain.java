package com.company;

import java.util.*;

public class BookMain {

    public static void main(String[] args) {

        // 問題4_4
        Book book1 = new Book("：新宿美味しい店巡り", "新宿酒坊", 1250);
        Book book2 = new Book("：渋谷わらしべ物語", "：渋谷長者 ", 780);
        Book book3 = new Book("：品川クロスロード", "品川GW", 390);
        Book book4 = new Book("：東京遺跡巡り", "日本橋麒麟", 980);

        BookShelf bookShelf = new BookShelf(Category.LITERATURE);

        bookShelf.addBook(book1);
        bookShelf.addBook(book2);
        bookShelf.addBook(book3);
        bookShelf.addBook(book4);

        // 問題4_5
        Iterator<Book> bookIterator = bookShelf.getIterator();
        while(bookIterator.hasNext()) {
            Book book = bookIterator.next();
            System.out.println(book.toString());
        }

        // 問題5_2
        bookShelf.addBook(book1.clone());
        Iterator<Book> j = bookShelf.getIterator();
        while(j.hasNext()) {
            Book bookInfo = j.next();
            System.out.println(bookInfo);
        }

        // 問題5_4
        // getIsbnの比較
        System.out.println(
                book1.getIsbn() == book1.clone().getIsbn()
        );
        // equalsの比較
        System.out.println(book1.equals(book1.clone()));

        // 問題6_4
        Book book5 = book1.clone();
        Book book6 = book2.clone();
        Book book7 = book3.clone();
        Book book8 = book4.clone();
        Book book9 = book1.clone();

        BookStore bookStore = new BookStore();
        bookStore.addBook(book1, Category.ART);
        bookStore.addBook(book2, Category.TECHNOLOGY);
        bookStore.addBook(book3, Category.HISTORY);
        bookStore.addBook(book4, Category.LITERATURE);
        bookStore.addBook(book5, Category.LANGUAGE);
        bookStore.addBook(book6, Category.SCIENCE);
        bookStore.addBook(book7, Category.LITERATURE);
        bookStore.addBook(book8, Category.ART);
        bookStore.addBook(book9, Category.HISTORY);

        bookStore.printAllBooks();

        // 問題6_4
        System.out.println(bookStore.selectByTitle("新宿"));
        System.out.println(bookStore.selectByAuthor("品川GW"));
        System.out.println(bookStore.selectByIsbn(1));

        //9_3
        Magazine jump = new Magazine();
        jump.addProduction(new Production("ONE PIECE", "四皇カイドウ死闘", "小田栄一郎","おりゃ～"));
        jump.addProduction(new Production("ブラッククローバー", "黒の暴牛団入団 ", "石川五右衛門","団長怖え～"));
        jump.addProduction(new Production("食戟のソーマ", "遠月学園入団", "田中太郎","てっぺんとるぞ"));

        // 9_6(単純なfor文の場合)
        for (int i = 0; i < jump.getSize(); i++) {
            System.out.println(jump.getProduction(i).getTitle());
        }


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "hoge");
        map.put(2, "foo");
        map.put(3, "bar");

        for (int id: map.keySet()){
            System.out.println(id);
        }

        Set<Integer> keys = map.keySet();
        Collection<String> valus = map.values();

        System.out.println(map.values());

        Map<String, String> fruit = new HashMap<>();

    }
}
