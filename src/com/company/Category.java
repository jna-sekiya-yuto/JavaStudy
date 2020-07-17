package com.company;

/**
 * 本のカテゴリ
 */
public enum Category {
    HISTORY(200, "歴史"),
    SCIENCE(300, "科学"),
    TECHNOLOGY(500, "技術"),
    ART(700, "美術"),
    LANGUAGE(800, "言語"),
    LITERATURE(900,"文学");

    private int code;
    private  String name;

    Category(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
