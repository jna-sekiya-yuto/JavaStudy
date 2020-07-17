package com.company.test07;

import java.util.Scanner;

/**
 * 週末テスト07
 * インタフェースについて理解しているか
 */
public class Main {
    public static void main(String[] args) {

        // 欲しい商品を生成
        Item item = new Item("あつまれ どうぶつの森", 5000);

        System.out.println("商品は" + item.getName() + "です。");

        while (true) {
            System.out.println("お支払い方法はいかがいたしますか？");
            System.out.println("現金払いの場合「1」、カード払いの場合「2」を入力してください");
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            if (input == 1) {
                // 支払い方法が現金の場合
                Register cash = new Cash();
                cash.bill(item);
                break;
            } else if (input == 2) {
                // 支払い方法が現金の場合
                Register card = new CreditCard();
                card.bill(item);
                break;
            } else {
                System.out.println("入力値が不正です。");
                // ここでscan.close()するとエラー発生する。なのでtry()で囲っても×
            }

        }
    }
}
