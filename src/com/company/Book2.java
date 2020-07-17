package com.company;

public class Book2 extends Production implements Page{
    private  int isbn;

    private int price = 250;

    private static int master_isbn = 1;

    // 問題6-1
    // デフォルトコンストラクタ
    public Book2(){

    }

    // コンストラクタ
    public Book2(String title, String subtitle, String author, String contents) {
        super(title, subtitle, author, contents);
        this.isbn =master_isbn++;
    }

    // 問題7-1
    @Override
    public String getSubtitle() {
        return title;
    }

    // 問題8-3
    @Override
    public int getPageSize() {
        return contents.length() / 10;
    }
}
