package com.company;

public class Production {

    /**
     * 題名
     */
    protected String title;

    /**
     * 副題
     */
    protected String subtitle;

    /**
     * 著者
     */
    protected String author;

    /**
     * 内容
     */
    protected String contents;

    // 問題6-2
    // デフォルトコンストラクタ
    public Production(){

    }

    // 問題4-2
    // コンストラクタ
    public Production(String title, String subTitle, String author, String contents) {
        this.title = title;
        this.subtitle = subTitle;
        this.author = author;
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getContents() {
        return contents;
    }
}
