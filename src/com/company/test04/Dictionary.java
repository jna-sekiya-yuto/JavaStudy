package com.company.test04;

import java.util.ArrayList;
import java.util.List;

/**
 * 辞書クラス
 * ただし本辞書は一般的なものとは異なり追加した順に値を保持する
 */
public class Dictionary {
    // 単語
    private List<String> words = new ArrayList<>();

    // 辞書に単語を追加する
    public void addWord(String word) {
        words.add(word);
    }

    // インデックスを指定しその単語を取得する
    // ただしインデックス不正の場合、"未登録です"を返却
    public String getWord(int index) {
        if (0 <= index && index < words.size()) {
            return words.get(index);
        } else {
            return "未登録です";
        }
    }

    // 保持している単語の数を返却する
    public int getSize() {
        return words.size();
    }
}
