package com.company.test07;

/**
 * クレジットカードクラス
 */
public class CreditCard implements Register{
    // 利用上限額
    private int upperLimit;
    // カード使用可否
    private boolean canUse;

    // コンストラクタ
    public CreditCard(){
        this.upperLimit = 10000;
        this.canUse = true;
    }

    @Override
    public void bill(Item item) {
        if (canBuy(item) && canUse) {
            upperLimit -= item.getPrice();
            System.out.println("ありがとうございます。こちら" + item.getName() + "でございます。");
        } else {
            System.out.println("現在カードがご利用いただけません。");
        }
    }

    private boolean canBuy(Item item) {
        return item.getPrice() < upperLimit;
    }
}
