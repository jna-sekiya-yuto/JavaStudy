package com.company.test06;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 辞書クラス
 */
public class Dictionary {
    // key:五十音、value:単語
    private Map<String, List<String>> wordMap = new HashMap<>();

    // 単語を追加する
    // keyには五十音を指定し単語を追加する。単語は辞書順にソートする
    public void addWord(String key, String... words) {
        List<String> addedWords = Arrays.asList(words); // IDEに従うとこれにかなり近づけるはず
        // 辞書順に単語をソート
        Collections.sort(addedWords);
        wordMap.put(key, addedWords);
    }

    // 単語を取得する
    public String getWord(String key, int index) {
        List<String> words = wordMap.get(key);
        if (wordMap.containsKey(key) && index < words.size()) {
            // keyのチェックは必須。ない場合はエラーで落ちる。
            return words.get(index);
        }
        return "その単語は未登録です。";
    }
}
