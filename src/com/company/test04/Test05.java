package com.company.test04;

/**
 * 週末テスト05
 * 主題：コレクションからgetする際の論理演算子に注意する
 */
public class Test05 {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

//        dictionary.addWord("おはよう");
//        dictionary.addWord("こんにちは");
//        dictionary.addWord("こんばんは");
        System.out.println(dictionary.getWord(0));

        // dictionaryでループ。Dictionaryのwordsが隠ぺいされているため拡張forは使用出来ない
        for (int i = 0; i < dictionary.getSize(); i++) {
            System.out.println(dictionary.getWord(i));
        }
    }
}
