package com.company.test07;

/**
 * 商品クラス
 */
public class Item {
    // 商品名
    private String name;

    // 価格
    private int price;

    // コンストラクタ
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
