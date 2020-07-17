package com.company;

public class Production2 {


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

    /**
     * デフォルトコンストラクタ
     */
    public Production2(){}

    /**
     * コンストラクタ
     *
     * @param title  題名
     * @param author 著者
     */
    public Production2(String title, String subtitle, String author, String contents) {
        this.title = title;
        this.subtitle = subtitle;
        this.author = author;
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() { return  subtitle; }

    public String getAuthor() {
        return author;
    }

    public String getContents() { return contents; }
}
