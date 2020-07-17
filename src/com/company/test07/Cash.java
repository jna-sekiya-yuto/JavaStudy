package com.company.test07;

import com.company.test05.Cat;

/**
 * 現金クラス
 */
public class Cash implements Register {

    // 所持金
    private int possession;

    // コンストラクタ
    public Cash() {
        this.possession = 3000;
    }

    @Override
    public void bill(Item item) {
        if (canBuy(item)) {
            possession -= item.getPrice();
            System.out.println("ありがとうございます。こちら" + item.getName() + "でございます。");
        } else {
            System.out.println("所持金が足りないようです。");
        }
    }

    private boolean canBuy(Item item) {
        return item.getPrice() < possession;
    }
}
