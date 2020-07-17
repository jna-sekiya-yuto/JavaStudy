package com.company.test99;

/**
 * 週末テスト99(高難易度)
 * OOPの考え方ができているか。Mapを正しく扱えるか。
 */
public class Main {

    public static void main(String[] args) {
        Student taro = new Student(1, "ジャパ太郎");

        taro.getScore().setJapaneseScore(250);
        taro.getScore().setMathScore(250);
        taro.getScore().setScienceScore(45);
        taro.getScore().setSocietyScore(70);
        taro.getScore().setEnglishScore(120);

        taro.getScore().displayTotal();
    }
}
