package com.company.test99;

import java.util.HashMap;
import java.util.Map;

/**
 * 点数クラス
 */
public class Score {

    // key: 科目、value:点数
    private Map<Subject, Integer> scores;

    // コンストラクタ
    public Score() {
        this.scores = new HashMap<>();
    }

    // 国語の採点する
    public void setJapaneseScore(int score) {
        setScore(Subject.JAPANESE, score);
    }

    // 数学の採点をする
    public void setMathScore(int score) {
        setScore(Subject.MATH, score);
    }

    // 理科の採点をする
    public void setScienceScore(int score) {
        setScore(Subject.SCIENCE, score);
    }

    // 社会の採点をする
    public void setSocietyScore(int score) {
        setScore(Subject.SOCIETY, score);
    }

    // 英語の採点をする
    public void setEnglishScore(int score) {
        setScore(Subject.ENGLISH, score);
    }

    // 総計を表示する
    public void displayTotal() {
        int total = 0;
        for (int score : scores.values()) {
            total += score;
        }
        System.out.println("----------------------------");
        System.out.println("総計は" + total + "点です。");

        for (Subject subject : scores.keySet()) {
            System.out.println(subject.getName() + "の点数は" + scores.get(subject) + "点です。");
        }
    }

    // 採点する
    private void setScore(Subject subject, int score) { // privateにしましょう
        if (subject.isOverMaxScore(score)) {
            System.out.println("指定した点数が" + subject.getName() +"の満点より高いです。");
            System.out.println("採点ミスをしていないか確認してください");
            return;
        }

        scores.put(subject, score);
    }
}
