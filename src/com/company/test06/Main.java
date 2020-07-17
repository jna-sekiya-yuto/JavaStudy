package com.company.test06;

/**
 * 週末テスト06
 * Mapの基本的な使い方を習得しているか
 */
public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        dictionary.addWord("て", "天国", "テレビ");
        dictionary.addWord("す", "スイカ", "スズメ");
        dictionary.addWord("と", "トマト", "都庁");

        // 「す」の2番目の要素を出力
        System.out.println(dictionary.getWord("す", 1));
    }
}
